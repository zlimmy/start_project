/**
 * 
 */
package com.huimodel.api.base;

import java.io.Serializable;
import java.util.List;

/**
 * @author FZ
 */
public class DShop implements Serializable {
	private static final long serialVersionUID = 1236965455833812554L;

	/*
	 * 店铺公告
	 */
	private String bulletin;

	private Long cid;
	/*
	 * 店铺描述
	 */
	private String desc;

	private String nick;

	/** 店招 **/
	private String pic_path;
	
	/** 头像 **/
	private String logo_path;

	private Long sid;
	/*
	 * 店铺标题
	 */
	private String title;

	private String shop_type;

	private String address;

	private String city;

	private String country;

	private String district;

	private String state;

	private String zip;

	private String status;
	private String owner;
	private Long owner_id;
	private String owner_avatar;

	private String latitude;
	private String longitude;
	private String created;
	private List<DProduct> products;

	private int fans;
	
	private String mobile;
	
	private Long proms;//促销商品数量
	private Long coupons;//购物券数量
	private Long lotteries;//抽奖数量
	private Long productcount;//商品个数
	private Boolean hasFacepay=false;//是否支持优惠买单


	//优惠买单详细信息
	private ShopFacepay facepay;
	
	public Long getProms() {
		return proms;
	}

	public void setProms(Long proms) {
		this.proms = proms;
	}

	public Long getCoupons() {
		return coupons;
	}

	public void setCoupons(Long coupons) {
		this.coupons = coupons;
	}

	public Long getLotteries() {
		return lotteries;
	}

	public void setLotteries(Long lotteries) {
		this.lotteries = lotteries;
	}

	public Long getProductcount() {
		return productcount;
	}

	public void setProductcount(Long productcount) {
		this.productcount = productcount;
	}

	public Boolean getHasFacepay() {
		return hasFacepay;
	}

	public void setHasFacepay(Boolean hasFacepay) {
		this.hasFacepay = hasFacepay;
	}



	/***
	 * 是否被关注
	 */
	private boolean is_attention;

	private int sort;
	
	/** 距离 **/
	private double distance;
	
	private double  rebate;

	public double getRebate() {
		return rebate;
	}

	public void setRebate(double rebate) {
		this.rebate = rebate;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getBulletin() {
		return bulletin;
	}

	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPic_path() {
		return pic_path;
	}

	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShop_type() {
		return shop_type;
	}

	public void setShop_type(String shop_type) {
		this.shop_type = shop_type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Long getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(Long owner_id) {
		this.owner_id = owner_id;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public List<DProduct> getProducts() {
		return products;
	}

	public void setProducts(List<DProduct> products) {
		this.products = products;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public boolean getIs_attention() {
		return is_attention;
	}

	public void setIs_attention(boolean is_attention) {
		this.is_attention = is_attention;
	}

	public int getFans() {
		return fans;
	}

	public void setFans(int fans) {
		this.fans = fans;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the owner_avatar
	 */
	public String getOwner_avatar() {
		return owner_avatar;
	}

	/**
	 * @param owner_avatar the owner_avatar to set
	 */
	public void setOwner_avatar(String owner_avatar) {
		this.owner_avatar = owner_avatar;
	}

	/**
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * @return the logo_path
	 */
	public String getLogo_path() {
		return logo_path;
	}

	/**
	 * @param logo_path the logo_path to set
	 */
	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}


	public ShopFacepay getFacepay() {
		return facepay;
	}

	public void setFacepay(ShopFacepay facepay) {
		this.facepay = facepay;
	}
}
