package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BijifenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BijifenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BijifenxiangView;


/**
 * 笔记分享
 *
 * @author 
 * @email 
 * @date 2023-02-26
 */
public interface BijifenxiangService extends IService<BijifenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BijifenxiangVO> selectListVO(Wrapper<BijifenxiangEntity> wrapper);
   	
   	BijifenxiangVO selectVO(@Param("ew") Wrapper<BijifenxiangEntity> wrapper);
   	
   	List<BijifenxiangView> selectListView(Wrapper<BijifenxiangEntity> wrapper);
   	
   	BijifenxiangView selectView(@Param("ew") Wrapper<BijifenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BijifenxiangEntity> wrapper);

}