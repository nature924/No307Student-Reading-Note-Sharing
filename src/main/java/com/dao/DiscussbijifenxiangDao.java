package com.dao;

import com.entity.DiscussbijifenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbijifenxiangVO;
import com.entity.view.DiscussbijifenxiangView;

/**
 * 笔记分享评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-26
 */
public interface DiscussbijifenxiangDao extends BaseMapper<DiscussbijifenxiangEntity> {
	
	List<DiscussbijifenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussbijifenxiangEntity> wrapper);
	
	DiscussbijifenxiangVO selectVO(@Param("ew") Wrapper<DiscussbijifenxiangEntity> wrapper);
	
	List<DiscussbijifenxiangView> selectListView(@Param("ew") Wrapper<DiscussbijifenxiangEntity> wrapper);

	List<DiscussbijifenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbijifenxiangEntity> wrapper);
	
	DiscussbijifenxiangView selectView(@Param("ew") Wrapper<DiscussbijifenxiangEntity> wrapper);
}