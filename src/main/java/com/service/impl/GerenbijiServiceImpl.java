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


import com.dao.GerenbijiDao;
import com.entity.GerenbijiEntity;
import com.service.GerenbijiService;
import com.entity.vo.GerenbijiVO;
import com.entity.view.GerenbijiView;

@Service("gerenbijiService")
public class GerenbijiServiceImpl extends ServiceImpl<GerenbijiDao, GerenbijiEntity> implements GerenbijiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GerenbijiEntity> page = this.selectPage(
                new Query<GerenbijiEntity>(params).getPage(),
                new EntityWrapper<GerenbijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GerenbijiEntity> wrapper) {
		  Page<GerenbijiView> page =new Query<GerenbijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GerenbijiVO> selectListVO(Wrapper<GerenbijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GerenbijiVO selectVO(Wrapper<GerenbijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GerenbijiView> selectListView(Wrapper<GerenbijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GerenbijiView selectView(Wrapper<GerenbijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}