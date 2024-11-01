
package com.entity.model;

import com.entity.DiscussbijifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 笔记分享评论表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class DiscussbijifenxiangModel  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 关联表id
	 */
	private Long refid;

	/**
	 * 用户id
	 */
	private Long userid;

	/**
	 * 用户名
	 */
	private String nickname;

	/**
	 * 评论内容
	 */
	private String content;

	/**
	 * 回复内容
	 */
	private String reply;

	public Long getRefid() {
		return refid;
	}

	public void setRefid(Long refid) {
		this.refid = refid;
	}


	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}


	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

}