
package com.entity.vo;

import com.entity.ForumEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 交流互动列表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class ForumVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 帖子标题
	 */
	private String title;

	/**
	 * 帖子内容
	 */
	private String content;

	/**
	 * 父节点id
	 */
	private Long parentid;

	/**
	 * 用户id
	 */
	private Long userid;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 状态
	 */
	private String isdone;

	/**
	 * 获取帖子标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置帖子标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * 获取帖子内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置帖子内容
	 */
	public void setContent(String content) {
		this.content = content;
	}


	/**
	 * 获取父节点id
	 */
	public Long getParentid() {
		return parentid;
	}
	/**
	 * 设置父节点id
	 */
	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}


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
	 * 获取用户名
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * 获取状态
	 */
	public String getIsdone() {
		return isdone;
	}
	/**
	 * 设置状态
	 */
	public void setIsdone(String isdone) {
		this.isdone = isdone;
	}

}