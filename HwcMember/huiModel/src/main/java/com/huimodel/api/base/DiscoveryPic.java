package com.huimodel.api.base;

import java.io.Serializable;

public class DiscoveryPic implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7167085063810633114L;
	private Long post_id;
	private Long id;
	private Integer position;
	private String url;
	private String created;
	/**
	 * @return the post_id
	 */
	public Long getPost_id() {
		return post_id;
	}
	/**
	 * @param post_id the post_id to set
	 */
	public void setPost_id(Long post_id) {
		this.post_id = post_id;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the position
	 */
	public Integer getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(Integer position) {
		this.position = position;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}
	

}
