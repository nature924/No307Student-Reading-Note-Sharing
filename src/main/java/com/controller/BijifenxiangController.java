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

import com.entity.BijifenxiangEntity;
import com.entity.view.BijifenxiangView;

import com.service.BijifenxiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 笔记分享
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/bijifenxiang")
public class BijifenxiangController {
    @Autowired
    private BijifenxiangService bijifenxiangService;

    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BijifenxiangEntity bijifenxiang,
		HttpServletRequest request){

String tableName = request.getSession().getAttribute("tableName").toString();
if(tableName.equals("yonghu")) {
			bijifenxiang.setYonghuming((String)request.getSession().getAttribute("username"));
		}
EntityWrapper<BijifenxiangEntity> ew = new EntityWrapper<BijifenxiangEntity>();
		PageUtils page = bijifenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bijifenxiang), params), params));

        return R.ok().put("data", page);
    }
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BijifenxiangEntity bijifenxiang, 
		HttpServletRequest request){
        EntityWrapper<BijifenxiangEntity> ew = new EntityWrapper<BijifenxiangEntity>();
		PageUtils page = bijifenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bijifenxiang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BijifenxiangEntity bijifenxiang){
       	EntityWrapper<BijifenxiangEntity> ew = new EntityWrapper<BijifenxiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bijifenxiang, "bijifenxiang")); 
        return R.ok().put("data", bijifenxiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BijifenxiangEntity bijifenxiang){
        EntityWrapper< BijifenxiangEntity> ew = new EntityWrapper< BijifenxiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bijifenxiang, "bijifenxiang")); 
		BijifenxiangView bijifenxiangView =  bijifenxiangService.selectView(ew);
		return R.ok("查询笔记分享成功").put("data", bijifenxiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BijifenxiangEntity bijifenxiang = bijifenxiangService.selectById(id);
        return R.ok().put("data", bijifenxiang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BijifenxiangEntity bijifenxiang = bijifenxiangService.selectById(id);
        return R.ok().put("data", bijifenxiang);
    }

	    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        BijifenxiangEntity bijifenxiang = bijifenxiangService.selectById(id);
        if(type.equals("1")) {
        	bijifenxiang.setThumbsupnum(bijifenxiang.getThumbsupnum()+1);
        } else {
        	bijifenxiang.setCrazilynum(bijifenxiang.getCrazilynum()+1);
        }
        bijifenxiangService.updateById(bijifenxiang);
        return R.ok();
    }
    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BijifenxiangEntity bijifenxiang, HttpServletRequest request){
    	bijifenxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bijifenxiang);

 bijifenxiangService.insert(bijifenxiang);
        return R.ok();
    }
 /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BijifenxiangEntity bijifenxiang, HttpServletRequest request){
    	bijifenxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bijifenxiang);
 bijifenxiangService.insert(bijifenxiang);
        return R.ok();
    }
    /**
     * 修改
     */
    @RequestMapping("/update")
    //@Transactional
    public R update(@RequestBody BijifenxiangEntity bijifenxiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bijifenxiang);
        bijifenxiangService.updateById(bijifenxiang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bijifenxiangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<BijifenxiangEntity> wrapper = new EntityWrapper<BijifenxiangEntity>();
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
int count = bijifenxiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
}