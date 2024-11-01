package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbijifenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbijifenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbijifenxiangView;


/**
 * 笔记分享评论表
 *
 * @author 
 * @email 
 * @date 2023-02-26
 */
public interface DiscussbijifenxiangService extends IService<DiscussbijifenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbijifenxiangVO> selectListVO(Wrapper<DiscussbijifenxiangEntity> wrapper);
   	
   	DiscussbijifenxiangVO selectVO(@Param("ew") Wrapper<DiscussbijifenxiangEntity> wrapper);
   	
   	List<DiscussbijifenxiangView> selectListView(Wrapper<DiscussbijifenxiangEntity> wrapper);
   	
   	DiscussbijifenxiangView selectView(@Param("ew") Wrapper<DiscussbijifenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbijifenxiangEntity> wrapper);

}