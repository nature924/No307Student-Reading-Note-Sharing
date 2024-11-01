
package com.entity.vo;

import com.entity.StoreupEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 收藏表列表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class StoreupVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 用户id
	 */
	private Long userid;

	/**
	 * 收藏id
	 */
	private Long refid;

	/**
	 * 表名
	 */
	private String tablename;

	/**
	 * 收藏名称
	 */
	private String name;

	/**
	 * 收藏图片
	 */
	private String picture;

	/**
	 * 类型(1:收藏,21:赞,22:踩)
	 */
	private String type;

	/**
	 * 推荐类型
	 */
	private String inteltype;

	/**
	 * 获取用户id
	 */
	public Long getUserid() {
		return userid;
	}
	/**
	 * 设置用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}


	/**
	 * 获取收藏id
	 */
	public Long getRefid() {
		return refid;
	}
	/**
	 * 设置收藏id
	 */
	public void setRefid(Long refid) {
		this.refid = refid;
	}


	/**
	 * 获取表名
	 */
	public String getTablename() {
		return tablename;
	}
	/**
	 * 设置表名
	 */
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}


	/**
	 * 获取收藏名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置收藏名称
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * 获取收藏图片
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * 设置收藏图片
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}


	/**
	 * 获取类型(1:收藏,21:赞,22:踩)
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置类型(1:收藏,21:赞,22:踩)
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * 获取推荐类型
	 */
	public String getInteltype() {
		return inteltype;
	}
	/**
	 * 设置推荐类型
	 */
	public void setInteltype(String inteltype) {
		this.inteltype = inteltype;
	}

}