
package com.entity.vo;

import com.entity.DiscussbijifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 笔记分享评论表列表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class DiscussbijifenxiangVO  implements Serializable {
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

	/**
	 * 获取关联表id
	 */
	public Long getRefid() {
		return refid;
	}
	/**
	 * 设置关联表id
	 */
	public void setRefid(Long refid) {
		this.refid = refid;
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
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置用户名
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	/**
	 * 获取评论内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置评论内容
	 */
	public void setContent(String content) {
		this.content = content;
	}


	/**
	 * 获取回复内容
	 */
	public String getReply() {
		return reply;
	}
	/**
	 * 设置回复内容
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}

}