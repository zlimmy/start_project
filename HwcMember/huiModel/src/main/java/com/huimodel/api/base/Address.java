/**
 * 
 */
package com.huimodel.api.base;

import java.io.Serializable;

/**
 * @author FZ
 */
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1779164174490657973L;
	
	private java.lang.Long id;
	private java.lang.String receiver_state;
	private java.lang.String receiver_name;
	private java.lang.String receiver_address;
	private java.lang.String receiver_zip;
	private java.lang.String receiver_mobile;
	private java.lang.String receiver_phone;
	private java.lang.String receiver_country;
	private java.lang.String receiver_city;
	private java.lang.String isdefault;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getReceiver_state() {
		return receiver_state;
	}

	public void setReceiver_state(java.lang.String receiver_state) {
		this.receiver_state = receiver_state;
	}

	public java.lang.String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(java.lang.String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public java.lang.String getReceiver_address() {
		return receiver_address;
	}

	public void setReceiver_address(java.lang.String receiver_address) {
		this.receiver_address = receiver_address;
	}

	public java.lang.String getReceiver_zip() {
		return receiver_zip;
	}

	public void setReceiver_zip(java.lang.String receiver_zip) {
		this.receiver_zip = receiver_zip;
	}

	public java.lang.String getReceiver_mobile() {
		return receiver_mobile;
	}

	public void setReceiver_mobile(java.lang.String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}

	public java.lang.String getReceiver_phone() {
		return receiver_phone;
	}

	public void setReceiver_phone(java.lang.String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}

	public java.lang.String getReceiver_country() {
		return receiver_country;
	}

	public void setReceiver_country(java.lang.String receiver_country) {
		this.receiver_country = receiver_country;
	}

	public java.lang.String getReceiver_city() {
		return receiver_city;
	}

	public void setReceiver_city(java.lang.String receiver_city) {
		this.receiver_city = receiver_city;
	}

	public java.lang.String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(java.lang.String isdefault) {
		this.isdefault = isdefault;
	}

}
