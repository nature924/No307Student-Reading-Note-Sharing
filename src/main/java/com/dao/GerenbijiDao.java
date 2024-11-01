package com.dao;

import com.entity.GerenbijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerenbijiVO;
import com.entity.view.GerenbijiView;

/**
 * 个人笔记
 * 
 * @author 
 * @email 
 * @date 2023-02-26
 */
public interface GerenbijiDao extends BaseMapper<GerenbijiEntity> {
	
	List<GerenbijiVO> selectListVO(@Param("ew") Wrapper<GerenbijiEntity> wrapper);
	
	GerenbijiVO selectVO(@Param("ew") Wrapper<GerenbijiEntity> wrapper);
	
	List<GerenbijiView> selectListView(@Param("ew") Wrapper<GerenbijiEntity> wrapper);

	List<GerenbijiView> selectListView(Pagination page,@Param("ew") Wrapper<GerenbijiEntity> wrapper);
	
	GerenbijiView selectView(@Param("ew") Wrapper<GerenbijiEntity> wrapper);
}