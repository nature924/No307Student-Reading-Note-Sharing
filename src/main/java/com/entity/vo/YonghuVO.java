
package com.entity.vo;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 用户列表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class YonghuVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 用户名
	 */
	private String yonghuming;

	/**
	 * 密码
	 */
	private String mima;

	/**
	 * 姓名
	 */
	private String xingming;

	/**
	 * 性别
	 */
	private String xingbie;

	/**
	 * 头像
	 */
	private String touxiang;

	/**
	 * 手机
	 */
	private String shouji;

	/**
	 * 邮箱
	 */
	private String youxiang;

	/**
	 * 兴趣标签
	 */
	private String xingqubiaoqian;

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
	 * 获取密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}


	/**
	 * 获取姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}


	/**
	 * 获取性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}


	/**
	 * 获取头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}


	/**
	 * 获取手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
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


	/**
	 * 获取兴趣标签
	 */
	public String getXingqubiaoqian() {
		return xingqubiaoqian;
	}
	/**
	 * 设置兴趣标签
	 */
	public void setXingqubiaoqian(String xingqubiaoqian) {
		this.xingqubiaoqian = xingqubiaoqian;
	}

}