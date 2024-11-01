package com.entity.view;

import com.entity.BijifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 笔记分享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-26
 */
@TableName("bijifenxiang")
public class BijifenxiangView  extends BijifenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BijifenxiangView(){
	}
 
 	public BijifenxiangView(BijifenxiangEntity bijifenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, bijifenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}