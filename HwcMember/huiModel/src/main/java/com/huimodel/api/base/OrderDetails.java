package com.huimodel.api.base;

import java.io.Serializable;
import java.util.List;

public class OrderDetails implements Serializable {

	private static final long serialVersionUID = -1480746086955580040L;

	private String barcode;

	private String imgurl;

	/*
	 * 类目
	 */
	private Long cid;

	/*
	 * 类目
	 */
	private Long sellercat;
	/*
	 * 产品编码
	 */
	private String product_id;

	/*
	 * 内部产品id
	 */
	private String pid;
	/*
	 * 子订单发货时间
	 */
	private String consign_time;
	/*
	 * 子订单级订单优惠金额
	 */
	private String discount_fee;
	/*
	 * 分摊之后的实付金额
	 */
	private String divide_order_fee;
	/*
	 * 子订单的交易结束时间说明
	 */
	private String end_time;

	private String invoice_no;
	/*
	 * 子订单发货的快递公司名称
	 */
	private String logistics_company;

	private int num;
	/*
	 * 只订单编码
	 */
	private Long oid;

	private String outer_iid;

	private String payment;

	private String price;
	private String purchase_price;

	private Integer refund_id;

	private String refund_status;

	private String seller_type;

	private String status;

	private String store_code;

	private String title;

	private String total_fee;

	// 套餐Id
	private Long suite_id;
	// 套餐 描述  eg. 黑色 16G
	private String suite_descript;

	/***
	 * 产品的外部编码 比如手机的IMEI码
	 */
	private List<String> out_ids;

	public String getSuite_descript() {
		return suite_descript;
	}

	public void setSuite_descript(String suite_descript) {
		this.suite_descript = suite_descript;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getConsign_time() {
		return consign_time;
	}

	public void setConsign_time(String consign_time) {
		this.consign_time = consign_time;
	}

	public String getDiscount_fee() {
		return discount_fee;
	}

	public void setDiscount_fee(String discount_fee) {
		this.discount_fee = discount_fee;
	}

	public String getDivide_order_fee() {
		return divide_order_fee;
	}

	public void setDivide_order_fee(String divide_order_fee) {
		this.divide_order_fee = divide_order_fee;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}

	public String getLogistics_company() {
		return logistics_company;
	}

	public void setLogistics_company(String logistics_company) {
		this.logistics_company = logistics_company;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(String purchase_price) {
		this.purchase_price = purchase_price;
	}

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getOuter_iid() {
		return outer_iid;
	}

	public void setOuter_iid(String outer_iid) {
		this.outer_iid = outer_iid;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getRefund_id() {
		return refund_id;
	}

	public void setRefund_id(Integer refund_id) {
		this.refund_id = refund_id;
	}

	public String getRefund_status() {
		return refund_status;
	}

	public void setRefund_status(String refund_status) {
		this.refund_status = refund_status;
	}

	public String getSeller_type() {
		return seller_type;
	}

	public void setSeller_type(String seller_type) {
		this.seller_type = seller_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStore_code() {
		return store_code;
	}

	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}

	public List<String> getOut_ids() {
		return out_ids;
	}

	public void setOut_ids(List<String> out_ids) {
		this.out_ids = out_ids;
	}

	public Long getSellercat() {
		return sellercat;
	}

	public void setSellercat(Long sellercat) {
		this.sellercat = sellercat;
	}

	public Long getSuite_id() {
		return suite_id;
	}

	public void setSuite_id(Long suite_id) {
		this.suite_id = suite_id;
	}

}
