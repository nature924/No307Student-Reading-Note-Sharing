package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GerenbijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GerenbijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenbijiView;


/**
 * 个人笔记
 *
 * @author 
 * @email 
 * @date 2023-02-26
 */
public interface GerenbijiService extends IService<GerenbijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GerenbijiVO> selectListVO(Wrapper<GerenbijiEntity> wrapper);
   	
   	GerenbijiVO selectVO(@Param("ew") Wrapper<GerenbijiEntity> wrapper);
   	
   	List<GerenbijiView> selectListView(Wrapper<GerenbijiEntity> wrapper);
   	
   	GerenbijiView selectView(@Param("ew") Wrapper<GerenbijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GerenbijiEntity> wrapper);

}