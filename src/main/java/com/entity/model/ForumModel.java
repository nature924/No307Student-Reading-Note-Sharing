
package com.entity.model;

import com.entity.ForumEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 交流互动
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class ForumModel  implements Serializable {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}


	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getIsdone() {
		return isdone;
	}

	public void setIsdone(String isdone) {
		this.isdone = isdone;
	}

}