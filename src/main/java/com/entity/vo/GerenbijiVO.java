
package com.entity.vo;

import com.entity.GerenbijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 个人笔记列表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class GerenbijiVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 笔记名称
	 */
	private String bijimingcheng;

	/**
	 * 笔记类型
	 */
	private String bijileixing;

	/**
	 * 笔记标签
	 */
	private String bijibiaoqian;

	/**
	 * 笔记图片
	 */
	private String bijitupian;

	/**
	 * 笔记内容
	 */
	private String bijineirong;

		/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;

	/**
	 * 用户名
	 */
	private String yonghuming;

	/**
	 * 邮箱
	 */
	private String youxiang;

	/**
	 * 赞
	 */
	private Integer thumbsupnum;

	/**
	 * 踩
	 */
	private Integer crazilynum;

	/**
	 * 获取笔记名称
	 */
	public String getBijimingcheng() {
		return bijimingcheng;
	}
	/**
	 * 设置笔记名称
	 */
	public void setBijimingcheng(String bijimingcheng) {
		this.bijimingcheng = bijimingcheng;
	}


	/**
	 * 获取笔记类型
	 */
	public String getBijileixing() {
		return bijileixing;
	}
	/**
	 * 设置笔记类型
	 */
	public void setBijileixing(String bijileixing) {
		this.bijileixing = bijileixing;
	}


	/**
	 * 获取笔记标签
	 */
	public String getBijibiaoqian() {
		return bijibiaoqian;
	}
	/**
	 * 设置笔记标签
	 */
	public void setBijibiaoqian(String bijibiaoqian) {
		this.bijibiaoqian = bijibiaoqian;
	}


	/**
	 * 获取笔记图片
	 */
	public String getBijitupian() {
		return bijitupian;
	}
	/**
	 * 设置笔记图片
	 */
	public void setBijitupian(String bijitupian) {
		this.bijitupian = bijitupian;
	}


	/**
	 * 获取笔记内容
	 */
	public String getBijineirong() {
		return bijineirong;
	}
	/**
	 * 设置笔记内容
	 */
	public void setBijineirong(String bijineirong) {
		this.bijineirong = bijineirong;
	}


	/**
	 * 获取发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
	/**
	 * 设置发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}


	/**
	 * 获取用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}


	/**
	 * 获取邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}


	public Integer getThumbsupnum() {
		return thumbsupnum;
	}

	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}


	public Integer getCrazilynum() {
		return crazilynum;
	}

	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}

}