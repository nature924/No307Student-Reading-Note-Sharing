package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 个人笔记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-26
 */
@TableName("gerenbiji")
public class GerenbijiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GerenbijiEntity() {
		
	}
	
	public GerenbijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    /**
	 * 主键id
	 */
	@TableId
	private Long id;

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


	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * 获取:笔记名称
	 */
	public String getBijimingcheng() {
		return bijimingcheng;
	}
	/**
	 * 设置:笔记名称
	 */
	public void setBijimingcheng(String bijimingcheng) {
		this.bijimingcheng = bijimingcheng;
	}


	/**
	 * 获取:笔记类型
	 */
	public String getBijileixing() {
		return bijileixing;
	}
	/**
	 * 设置:笔记类型
	 */
	public void setBijileixing(String bijileixing) {
		this.bijileixing = bijileixing;
	}


	/**
	 * 获取:笔记标签
	 */
	public String getBijibiaoqian() {
		return bijibiaoqian;
	}
	/**
	 * 设置:笔记标签
	 */
	public void setBijibiaoqian(String bijibiaoqian) {
		this.bijibiaoqian = bijibiaoqian;
	}


	/**
	 * 获取:笔记图片
	 */
	public String getBijitupian() {
		return bijitupian;
	}
	/**
	 * 设置:笔记图片
	 */
	public void setBijitupian(String bijitupian) {
		this.bijitupian = bijitupian;
	}


	/**
	 * 获取:笔记内容
	 */
	public String getBijineirong() {
		return bijineirong;
	}
	/**
	 * 设置:笔记内容
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
	 * 获取:用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置:用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}


	/**
	 * 获取:邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置:邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}


	/**
	 * 获取:赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置:赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}


	/**
	 * 获取:踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置:踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}

}