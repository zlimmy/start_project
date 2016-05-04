package com.huimodel.api.base;

import java.io.Serializable;


public class GetTuiMessage implements Serializable {

	/**
	 * 消息体
	 */
	private static final long serialVersionUID = 1L;
	private String id; 			//消息ID   app用来判断是否接受过这个消息
	private boolean issave;		//是否保存     ture 的话本地会将消息存入数据库
	private int tag;  	    	//类型        0后台执行专用    1.普通消息  	2跳转activit 3,横条广告
	private String title;		//普通消息 标题  字数15以内
	private String msg;			//普通消息内容标题扩展,字数限制在30以内
	private String msgbody;		//具体的消息内容
	private int activity;		//要跳转的 app页面  1001 消息列表  1002商品列表  1003 促销列表（试用于代理）
	private String code;		//如果需要 具体指定到某条消息 某个商品时 这传对应的ID
	private String img_url;		//横条广告图片
	private boolean ishow;		//是否点击 ture  已点 false 未点
	private String sendTime;	//
	private String web_url;		//网页地址
	
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	//扩展
	private boolean isplay;		//声音播放（可实现）
	
	public boolean isIshow() {
		return ishow;
	}
	public void setIshow(boolean ishow) {
		this.ishow = ishow;
	}
	

	public boolean isIssave() {
		return issave;
	}
	public void setIssave(boolean issave) {
		this.issave = issave;
	}
	public String getMsgbody() {
		return msgbody;
	}
	public void setMsgbody(String msgbody) {
		this.msgbody = msgbody;
	}

	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getActivity() {
		return activity;
	}
	public void setActivity(int activity) {
		this.activity = activity;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public boolean isIsplay() {
		return isplay;
	}
	public void setIsplay(boolean isplay) {
		this.isplay = isplay;
	}


}
