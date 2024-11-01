
package com.entity.vo;

import com.entity.NewsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 公告信息列表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class NewsVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 标题
	 */
	private String title;

	/**
	 * 简介
	 */
	private String introduction;

	/**
	 * 图片
	 */
	private String picture;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 获取标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * 获取简介
	 */
	public String getIntroduction() {
		return introduction;
	}
	/**
	 * 设置简介
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}


	/**
	 * 获取图片
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * 设置图片
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}


	/**
	 * 获取内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置内容
	 */
	public void setContent(String content) {
		this.content = content;
	}

}