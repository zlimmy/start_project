package com.huimodel.api.base;

import java.util.List;

public class Discovery  extends HwcObject {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 8378470320517981737L;
	 
	/**
	 * 文章id
	 */
	private java.lang.Long id;
	/**
	 * 大分类
	 */
	private Long cid;
	/**
	 * 文章类型
	 */
	private java.lang.String cat;
	/**
	 * 文章标题
	 */
	private java.lang.String title;
	
	/**
	 * 分享标题
	 */
	private java.lang.String share_title;


	/**
	 * 文章摘要
	 */
	private java.lang.String excerpt;
	/**
	 * 状态
	 */
	private java.lang.String status;
	/**
	 * 排序
	 */
	private java.lang.Integer sort;
	/**
	 * 是否置顶
	 */
	private java.lang.Integer istop;
	/**
	 * 内容地址
	 */
	private java.lang.String content_url;
	/**
	 * 
	 */
	private java.lang.String exts1;
	/**
	 * 
	 */
	private java.lang.String exts2;
	/**
	 * 创建时间
	 */
	private java.lang.String created;
	/**
	 * 关注数量
	 */
	private Boolean attention;
	/**
	 * 浏览数量
	 */
	private Integer views = 0;
	/**
	 * 收藏数
	 */
	private Integer collections;
	/**
	 * 位置
	 */
	private Long location_id;
	/**
	 * 文章来源
	 */
	private String src;
	/**
	 * 作者
	 */
	private String author;
	
	private List<DiscoveryPic> pics;
	/***
	 * 
	 */
	private String addr;
	/**
	 * 收费规则
	 */
	private PostAdvertRule rule;
	/**
	 * 是否已经点击过 赚
	 */
	private Boolean earned;
	
	
	public Long getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Long location_id) {
		this.location_id = location_id;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getCat() {
		return cat;
	}

	public void setCat(java.lang.String cat) {
		this.cat = cat;
	}

	public java.lang.String getTitle() {
		return title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getExcerpt() {
		return excerpt;
	}

	public void setExcerpt(java.lang.String excerpt) {
		this.excerpt = excerpt;
	}

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.Integer getSort() {
		return sort;
	}

	public void setSort(java.lang.Integer sort) {
		this.sort = sort;
	}

	public java.lang.Integer getIstop() {
		return istop;
	}

	public void setIstop(java.lang.Integer istop) {
		this.istop = istop;
	}

	public java.lang.String getContent_url() {
		return content_url;
	}

	public void setContent_url(java.lang.String content_url) {
		this.content_url = content_url;
	}
	
	public java.lang.String getExts1() {
		return exts1;
	}

	public void setExts1(java.lang.String exts1) {
		this.exts1 = exts1;
	}

	public java.lang.String getExts2() {
		return exts2;
	}

	public void setExts2(java.lang.String exts2) {
		this.exts2 = exts2;
	}

	public java.lang.String getCreated() {
		return created;
	}

	public void setCreated(java.lang.String created) {
		this.created = created;
	}

	public List<DiscoveryPic> getPics() {
		return pics;
	}

	public void setPics(List<DiscoveryPic> pics) {
		this.pics = pics;
	}

	public Boolean getAttention() {
		return attention;
	}

	public void setAttention(Boolean attention) {
		this.attention = attention;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getCollections() {
		return collections;
	}

	public void setCollections(Integer collections) {
		this.collections = collections;
	}

	public PostAdvertRule getRule() {
		return rule;
	}

	public void setRule(PostAdvertRule rule) {
		this.rule = rule;
	}

	 

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Boolean getEarned() {
		return earned;
	}

	public void setEarned(Boolean earned) {
		this.earned = earned;
	}
	public java.lang.String getShare_title() {
		return share_title;
	}

	public void setShare_title(java.lang.String share_title) {
		this.share_title = share_title;
	}

}
