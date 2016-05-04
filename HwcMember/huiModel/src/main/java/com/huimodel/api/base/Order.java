package com.huimodel.api.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Order  implements Serializable {


	/**
	 * 订单对象
	 */
	private static final long serialVersionUID = 5285279905387462681L;
	private Long rid;
	/*
	 * 买家备注信息
	 */
	private String buyer_memo;
	
	private String buyer_mobile;
	private String buyer_user_id;
	private java.lang.String seller_flag;
	private java.lang.String buyer_message;
	private String paytype;
	
	private String paytype_desc;
	/*
	 * 买家昵称
	 */
	private String buyer_nick;
	/*
	 * 买家店铺
	 */
	private Long buyer_shop_id;
	
	/*
	 * 买家店铺
	 */
	private String buyer_shop_nike;
	private String paycode;
	private String tradefrom;
	
	private String paycode_desc;
	private String tradefrom_desc;
	/*
	 * 买家是否已评价
	 */
	private Boolean buyer_rate;
	/*
	 * 卖店
	 */
	private Long seller_shop;

	/*
	 * 收货人
	 */
	private String receiver_name;
	/*
	 * 卖家发货时间
	 */
	private String consign_time;
	/*
	 * 系统优惠金额
	 */
	private String discount_fee;
	/*
	 * 商品购买数量
	 */
	private Integer num;

	/*
	 * 支付时间
	 */
	private String pay_time;
	/*
	 * 实付金额
	 */
	private String payment;
	/*
	 * 邮费
	 */
	private String post_fee;
	/*
	 * 商品价格
	 */
	private String price;
	/*
 * 
 */
	private Integer real_point_fee;

	private String receiver_address;

	private String receiver_city;

	private String receiver_country;

	private String receiver_district;

	private String receiver_mobile;

	private String receiver_phone;

	private String receiver_state;

	private String receiver_town;

	private String receiver_zip;

	private String seller_memo;
	/*
	 * 卖家昵称
	 */
	private String seller_nick;
	private String seller_user_id;
	private String seller_shop_nike;
	/*
	 * 卖家电话
	 */
	private String shop_mobile; 
	/*
	 * 卖家是否已评价
	 */
	private Boolean seller_rate;
	/*
	 * 创建交易时的物流方式（交易完成前，物流方式有可能改变，但系统里的这个字段一直不变）。可选值：free(卖家包邮),post(平邮),express(
	 * 快递),ems(EMS),virtual(虚拟发货)，25(次日必达)，26(预约配送)。
	 */
	private String shipping_type;

	private String status;

	private String title;

	private BigDecimal total_fee;
	
	/*
	 * 交易类型列表，同时查询多种交易类型可用逗号分隔。默认同时查询guarantee_trade, auto_delivery, ec,
	 * cod的4种交易类型的数据 可选值 fixed(一口价) auction(拍卖) guarantee_trade(一口价、拍卖)
	 * auto_delivery(自动发货) independent_simple_trade(旺店入门版交易)
	 * independent_shop_trade(旺店标准版交易) ec(直冲) cod(货到付款) fenxiao(分销)
	 * game_equipment(游戏装备) shopex_trade(ShopEX交易) netcn_trade(万网交易)
	 * external_trade(统一外部交易)o2o_offlinetrade（O2O交易）step
	 * (万人团)nopaid(无付款订单)pre_auth_type(预授权0元购机交易)
	 */
	private String type;

	/**
	 * 订单创建时间
	 */
	private String created;
	
	//销售员id
	private Long saleid;
	
	//批次号
	private Long batchid;
	//销售员 昵称
	private String sale_nick;
	
	//邀请id
	private String invitation_code;
	
	private String prom_code;
	
	private DPrizeCoupon coupon;
	
	private List<OrderDetails>  details;
	private List<OrderPayDetail>  payDetails;
	
	
	private double balance;
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Boolean getBuyer_rate() {
		return buyer_rate;
	}

	public Boolean getSeller_rate() {
		return seller_rate;
	}

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}
	
	public Long getBatchid() {
		return batchid;
	}

	public void setBatchid(Long batchid) {
		this.batchid = batchid;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getBuyer_memo() {
		return buyer_memo;
	} 

	public void setBuyer_memo(String buyer_memo) {
		this.buyer_memo = buyer_memo;
	}

	public String getBuyer_mobile() {
		return buyer_mobile;
	}

	public void setBuyer_mobile(String buyer_mobile) {
		this.buyer_mobile = buyer_mobile;
	}

	public String getTradefrom() {
		return tradefrom;
	}

	public void setTradefrom(String tradefrom) {
		this.tradefrom = tradefrom;
	}

	public String getBuyer_nick() {
		return buyer_nick;
	}

	public void setBuyer_nick(String buyer_nick) {
		this.buyer_nick = buyer_nick;
	}

	public Long getBuyer_shop_id() {
		return buyer_shop_id;
	}

	public String getPaycode() {
		return paycode;
	}

	public void setPaycode(String paycode) {
		this.paycode = paycode;
	}

	public void setBuyer_shop_id(Long buyer_shop_id) {
		this.buyer_shop_id = buyer_shop_id;
	}

	public Boolean isBuyer_rate() {
		return buyer_rate;
	}

	public void setBuyer_rate(Boolean buyer_rate) {
		this.buyer_rate = buyer_rate;
	}

	public Long getSeller_shop() {
		return seller_shop;
	}

	public void setSeller_shop(Long seller_shop) {
		this.seller_shop = seller_shop;
	}

	public String getBuyer_user_id() {
		return buyer_user_id;
	}

	public void setBuyer_user_id(String buyer_user_id) {
		this.buyer_user_id = buyer_user_id;
	}

	public String getBuyer_shop_nike() {
		return buyer_shop_nike;
	}

	public void setBuyer_shop_nike(String buyer_shop_nike) {
		this.buyer_shop_nike = buyer_shop_nike;
	}

	public String getSeller_user_id() {
		return seller_user_id;
	}

	public void setSeller_user_id(String seller_user_id) {
		this.seller_user_id = seller_user_id;
	}

	public String getSeller_shop_nike() {
		return seller_shop_nike;
	}

	public void setSeller_shop_nike(String seller_shop_nike) {
		this.seller_shop_nike = seller_shop_nike;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
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

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPay_time() {
		return pay_time;
	}

	public void setPay_time(String pay_time) {
		this.pay_time = pay_time;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPost_fee() {
		return post_fee;
	}

	public void setPost_fee(String post_fee) {
		this.post_fee = post_fee;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getReal_point_fee() {
		return real_point_fee;
	}

	public void setReal_point_fee(Integer real_point_fee) {
		this.real_point_fee = real_point_fee;
	}

	public String getReceiver_address() {
		return receiver_address;
	}

	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}

	public String getReceiver_city() {
		return receiver_city;
	}

	public void setReceiver_city(String receiver_city) {
		this.receiver_city = receiver_city;
	}

	public String getReceiver_country() {
		return receiver_country;
	}

	public void setReceiver_country(String receiver_country) {
		this.receiver_country = receiver_country;
	}

	public String getReceiver_district() {
		return receiver_district;
	}

	public void setReceiver_district(String receiver_district) {
		this.receiver_district = receiver_district;
	}

	public String getReceiver_mobile() {
		return receiver_mobile;
	}

	public void setReceiver_mobile(String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}

	public String getReceiver_phone() {
		return receiver_phone;
	}

	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}

	public String getReceiver_state() {
		return receiver_state;
	}

	public void setReceiver_state(String receiver_state) {
		this.receiver_state = receiver_state;
	}

	public String getReceiver_town() {
		return receiver_town;
	}

	public void setReceiver_town(String receiver_town) {
		this.receiver_town = receiver_town;
	}

	public String getReceiver_zip() {
		return receiver_zip;
	}

	public void setReceiver_zip(String receiver_zip) {
		this.receiver_zip = receiver_zip;
	}

	public String getSeller_memo() {
		return seller_memo;
	}

	public void setSeller_memo(String seller_memo) {
		this.seller_memo = seller_memo;
	}

	public String getSeller_nick() {
		return seller_nick;
	}

	public void setSeller_nick(String seller_nick) {
		this.seller_nick = seller_nick;
	}

	public Boolean isSeller_rate() {
		return seller_rate;
	}

	public void setSeller_rate(Boolean seller_rate) {
		this.seller_rate = seller_rate;
	}

	public String getShipping_type() {
		return shipping_type;
	}

	public void setShipping_type(String shipping_type) {
		this.shipping_type = shipping_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(BigDecimal total_fee) {
		this.total_fee = total_fee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public List<OrderDetails> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetails> details) {
		this.details = details;
	}

	public Long getSaleid() {
		return saleid;
	}

	public void setSaleid(Long saleid) {
		this.saleid = saleid;
	}

	public String getInvitation_code() {
		return invitation_code;
	}

	public void setInvitation_code(String invitation_code) {
		this.invitation_code = invitation_code;
	}

	public String getProm_code() {
		return prom_code;
	}

	public void setProm_code(String prom_code) {
		this.prom_code = prom_code;
	}

	public String getSale_nick() {
		return sale_nick;
	}

	public void setSale_nick(String sale_nick) {
		this.sale_nick = sale_nick;
	}

	public DPrizeCoupon getCoupon() {
		return coupon;
	}

	public void setCoupon(DPrizeCoupon coupon) {
		this.coupon = coupon;
	}

	public String getPaytype_desc() {
		return paytype_desc;
	}

	public void setPaytype_desc(String paytype_desc) {
		this.paytype_desc = paytype_desc;
	}

	public String getPaycode_desc() {
		return paycode_desc;
	}

	public void setPaycode_desc(String paycode_desc) {
		this.paycode_desc = paycode_desc;
	}

	public String getTradefrom_desc() {
		return tradefrom_desc;
	}

	public void setTradefrom_desc(String tradefrom_desc) {
		this.tradefrom_desc = tradefrom_desc;
	}

	public List<OrderPayDetail> getPayDetails() {
		return payDetails;
	}

	public void setPayDetails(List<OrderPayDetail> payDetails) {
		this.payDetails = payDetails;
	}

	public java.lang.String getSeller_flag() {
		return seller_flag;
	}
	
	

	public String getShop_mobile() {
		return shop_mobile;
	}

	public void setShop_mobile(String shop_mobile) {
		this.shop_mobile = shop_mobile;
	}

	public void setSeller_flag(java.lang.String seller_flag) {
		this.seller_flag = seller_flag;
	}

	public java.lang.String getBuyer_message() {
		return buyer_message;
	}

	public void setBuyer_message(java.lang.String buyer_message) {
		this.buyer_message = buyer_message;
	}

	
}

