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


import com.dao.BijifenxiangDao;
import com.entity.BijifenxiangEntity;
import com.service.BijifenxiangService;
import com.entity.vo.BijifenxiangVO;
import com.entity.view.BijifenxiangView;

@Service("bijifenxiangService")
public class BijifenxiangServiceImpl extends ServiceImpl<BijifenxiangDao, BijifenxiangEntity> implements BijifenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BijifenxiangEntity> page = this.selectPage(
                new Query<BijifenxiangEntity>(params).getPage(),
                new EntityWrapper<BijifenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BijifenxiangEntity> wrapper) {
		  Page<BijifenxiangView> page =new Query<BijifenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BijifenxiangVO> selectListVO(Wrapper<BijifenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BijifenxiangVO selectVO(Wrapper<BijifenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BijifenxiangView> selectListView(Wrapper<BijifenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BijifenxiangView selectView(Wrapper<BijifenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}