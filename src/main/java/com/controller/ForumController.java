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

import com.entity.ForumEntity;
import com.entity.view.ForumView;

import com.service.ForumService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
/**
 * 交流互动
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/forum")
public class ForumController {
    @Autowired
    private ForumService forumService;

    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ForumEntity forum,
		HttpServletRequest request){
if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		forum.setUserid((Long)request.getSession().getAttribute("userId"));
    	}
EntityWrapper<ForumEntity> ew = new EntityWrapper<ForumEntity>();
		PageUtils page = forumService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, forum), params), params));

        return R.ok().put("data", page);
    }
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ForumEntity forum, 
		HttpServletRequest request){
        EntityWrapper<ForumEntity> ew = new EntityWrapper<ForumEntity>();
		PageUtils page = forumService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, forum), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ForumEntity forum){
       	EntityWrapper<ForumEntity> ew = new EntityWrapper<ForumEntity>();
      	ew.allEq(MPUtil.allEQMapPre( forum, "forum")); 
        return R.ok().put("data", forumService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ForumEntity forum){
        EntityWrapper< ForumEntity> ew = new EntityWrapper< ForumEntity>();
 		ew.allEq(MPUtil.allEQMapPre( forum, "forum")); 
		ForumView forumView =  forumService.selectView(ew);
		return R.ok("查询交流互动成功").put("data", forumView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ForumEntity forum = forumService.selectById(id);
        return R.ok().put("data", forum);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ForumEntity forum = forumService.selectById(id);
        return R.ok().put("data", forum);
    }
    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ForumEntity forum, HttpServletRequest request){
    	forum.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(forum);

 forumService.insert(forum);
        return R.ok();
    }
 /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ForumEntity forum, HttpServletRequest request){
    	forum.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(forum);
 forumService.insert(forum);
        return R.ok();
    }
    /**
     * 修改
     */
    @RequestMapping("/update")
    //@Transactional
    public R update(@RequestBody ForumEntity forum, HttpServletRequest request){
        //ValidatorUtils.validateEntity(forum);
        forumService.updateById(forum);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        forumService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ForumEntity> wrapper = new EntityWrapper<ForumEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}
if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wrapper.eq("userid", (Long)request.getSession().getAttribute("userId"));
    	}
int count = forumService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
}