package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussbijifenxiangDao;
import com.entity.DiscussbijifenxiangEntity;
import com.service.DiscussbijifenxiangService;
import com.entity.vo.DiscussbijifenxiangVO;
import com.entity.view.DiscussbijifenxiangView;

@Service("discussbijifenxiangService")
public class DiscussbijifenxiangServiceImpl extends ServiceImpl<DiscussbijifenxiangDao, DiscussbijifenxiangEntity> implements DiscussbijifenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbijifenxiangEntity> page = this.selectPage(
                new Query<DiscussbijifenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussbijifenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbijifenxiangEntity> wrapper) {
		  Page<DiscussbijifenxiangView> page =new Query<DiscussbijifenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbijifenxiangVO> selectListVO(Wrapper<DiscussbijifenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbijifenxiangVO selectVO(Wrapper<DiscussbijifenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbijifenxiangView> selectListView(Wrapper<DiscussbijifenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbijifenxiangView selectView(Wrapper<DiscussbijifenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}