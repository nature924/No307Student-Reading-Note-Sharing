
package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用户
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-26
 */
public class YonghuModel  implements Serializable {
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

	public String getYonghuming() {
		return yonghuming;
	}

	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}


	public String getMima() {
		return mima;
	}

	public void setMima(String mima) {
		this.mima = mima;
	}


	public String getXingming() {
		return xingming;
	}

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}


	public String getXingbie() {
		return xingbie;
	}

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}


	public String getTouxiang() {
		return touxiang;
	}

	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}


	public String getShouji() {
		return shouji;
	}

	public void setShouji(String shouji) {
		this.shouji = shouji;
	}


	public String getYouxiang() {
		return youxiang;
	}

	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}


	public String getXingqubiaoqian() {
		return xingqubiaoqian;
	}

	public void setXingqubiaoqian(String xingqubiaoqian) {
		this.xingqubiaoqian = xingqubiaoqian;
	}

}