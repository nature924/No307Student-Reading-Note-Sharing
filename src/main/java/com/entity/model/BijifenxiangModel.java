
package com.entity.model;

import com.entity.BijifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 笔记分享
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class BijifenxiangModel  implements Serializable {
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
	 * 分享日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fenxiangriqi;

	/**
	 * 用户名
	 */
	private String yonghuming;

	/**
	 * 邮箱
	 */
	private String youxiang;

	/**
	 * 是否审核
	 */
	private String sfsh;

	/**
	 * 审核回复
	 */
	private String shhf;

	/**
	 * 赞
	 */
	private Integer thumbsupnum;

	/**
	 * 踩
	 */
	private Integer crazilynum;

	public String getBijimingcheng() {
		return bijimingcheng;
	}

	public void setBijimingcheng(String bijimingcheng) {
		this.bijimingcheng = bijimingcheng;
	}


	public String getBijileixing() {
		return bijileixing;
	}

	public void setBijileixing(String bijileixing) {
		this.bijileixing = bijileixing;
	}


	public String getBijibiaoqian() {
		return bijibiaoqian;
	}

	public void setBijibiaoqian(String bijibiaoqian) {
		this.bijibiaoqian = bijibiaoqian;
	}


	public String getBijitupian() {
		return bijitupian;
	}

	public void setBijitupian(String bijitupian) {
		this.bijitupian = bijitupian;
	}


	public String getBijineirong() {
		return bijineirong;
	}

	public void setBijineirong(String bijineirong) {
		this.bijineirong = bijineirong;
	}


	public Date getFenxiangriqi() {
		return fenxiangriqi;
	}

	public void setFenxiangriqi(Date fenxiangriqi) {
		this.fenxiangriqi = fenxiangriqi;
	}


	public String getYonghuming() {
		return yonghuming;
	}

	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}


	public String getYouxiang() {
		return youxiang;
	}

	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}


	public String getSfsh() {
		return sfsh;
	}

	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}


	public String getShhf() {
		return shhf;
	}

	public void setShhf(String shhf) {
		this.shhf = shhf;
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