package com.controller;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GerenbijiEntity;
import com.entity.view.GerenbijiView;

import com.service.GerenbijiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 个人笔记
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/gerenbiji")
public class GerenbijiController {
    @Autowired
    private GerenbijiService gerenbijiService;

    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GerenbijiEntity gerenbiji,
		HttpServletRequest request){

String tableName = request.getSession().getAttribute("tableName").toString();
if(tableName.equals("yonghu")) {
			gerenbiji.setYonghuming((String)request.getSession().getAttribute("username"));
		}
EntityWrapper<GerenbijiEntity> ew = new EntityWrapper<GerenbijiEntity>();
		PageUtils page = gerenbijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gerenbiji), params), params));

        return R.ok().put("data", page);
    }
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GerenbijiEntity gerenbiji, 
		HttpServletRequest request){
        EntityWrapper<GerenbijiEntity> ew = new EntityWrapper<GerenbijiEntity>();
		PageUtils page = gerenbijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gerenbiji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GerenbijiEntity gerenbiji){
       	EntityWrapper<GerenbijiEntity> ew = new EntityWrapper<GerenbijiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gerenbiji, "gerenbiji")); 
        return R.ok().put("data", gerenbijiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GerenbijiEntity gerenbiji){
        EntityWrapper< GerenbijiEntity> ew = new EntityWrapper< GerenbijiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gerenbiji, "gerenbiji")); 
		GerenbijiView gerenbijiView =  gerenbijiService.selectView(ew);
		return R.ok("查询个人笔记成功").put("data", gerenbijiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GerenbijiEntity gerenbiji = gerenbijiService.selectById(id);
        return R.ok().put("data", gerenbiji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GerenbijiEntity gerenbiji = gerenbijiService.selectById(id);
        return R.ok().put("data", gerenbiji);
    }

	    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        GerenbijiEntity gerenbiji = gerenbijiService.selectById(id);
        if(type.equals("1")) {
        	gerenbiji.setThumbsupnum(gerenbiji.getThumbsupnum()+1);
        } else {
        	gerenbiji.setCrazilynum(gerenbiji.getCrazilynum()+1);
        }
        gerenbijiService.updateById(gerenbiji);
        return R.ok();
    }
    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GerenbijiEntity gerenbiji, HttpServletRequest request){
    	gerenbiji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gerenbiji);

 gerenbijiService.insert(gerenbiji);
        return R.ok();
    }
 /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GerenbijiEntity gerenbiji, HttpServletRequest request){
    	gerenbiji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gerenbiji);
 gerenbijiService.insert(gerenbiji);
        return R.ok();
    }
    /**
     * 修改
     */
    @RequestMapping("/update")
    //@Transactional
    public R update(@RequestBody GerenbijiEntity gerenbiji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gerenbiji);
        gerenbijiService.updateById(gerenbiji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gerenbijiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GerenbijiEntity> wrapper = new EntityWrapper<GerenbijiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

String tableName = request.getSession().getAttribute("tableName").toString();
if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}
int count = gerenbijiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
}