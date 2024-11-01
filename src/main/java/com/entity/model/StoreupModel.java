
package com.entity.model;

import com.entity.StoreupEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 收藏表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class StoreupModel  implements Serializable {
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

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}


	public Long getRefid() {
		return refid;
	}

	public void setRefid(Long refid) {
		this.refid = refid;
	}


	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getInteltype() {
		return inteltype;
	}

	public void setInteltype(String inteltype) {
		this.inteltype = inteltype;
	}

}