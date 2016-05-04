package com.huimodel.api.base;

import java.io.Serializable;
import java.util.Date;

public class PlatformPrize implements Serializable,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2808841192557859918L;
	// 物品代码
	private String code;
	// 物品描述
	private String descript;
	private String pic_url;
	// 价值
	private Double price;
	private Double point;
	private String cat;
	private Long cid;
	private String status;
	private Date period_begin;
	private Date period_end;

	private String remark;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPoint() {
		return point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Date getPeriod_begin() {
		return period_begin;
	}

	public void setPeriod_begin(Date period_begin) {
		this.period_begin = period_begin;
	}

	public Date getPeriod_end() {
		return period_end;
	}

	public void setPeriod_end(Date period_end) {
		this.period_end = period_end;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}