package com.huimodel.api.base;

public class DPrize {
	/**
	 * 
	 */
	private static final long serialVersionUID = -587068008708378455L;
	/**
	 * 物品代码
	 */
	private String code;	
	/**
	 *  物品描述
	 */
	private String descript;
	/**
	 * 奖品图片
	 */
	private String pic_url;
	/**
	 * 价值
	 */
	private Double price;
	/**
	 * 是否是虚拟物品
	 */
	private Integer is_virtual;
	/**
	 * 创建时间
	 */
	private String created;
	
	private String cat;

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

	public Integer getIs_virtual() {
		return is_virtual;
	}

	public void setIs_virtual(Integer is_virtual) {
		this.is_virtual = is_virtual;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

}
