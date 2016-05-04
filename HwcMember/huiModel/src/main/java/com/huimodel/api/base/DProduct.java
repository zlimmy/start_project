package com.huimodel.api.base;

import java.io.Serializable;
import java.util.List;

public class DProduct implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Long shop_id;
    private String latitude;
    private String longitude;
    private String shop_name;
    private Long cartid;

    public Long getCartid() {
        return cartid;
    }

    public void setCartid(Long cartid) {
        this.cartid = cartid;
    }

    public void setEditing(boolean isEditing) {
        this.isEditing = isEditing;
    }

    public void setChildSelected(boolean isChildSelected) {
        this.isChildSelected = isChildSelected;
    }

    public void setInvalidItem(boolean isInvalidItem) {
        this.isInvalidItem = isInvalidItem;
    }

    public void setBelongInvalidList(boolean isBelongInvalidList) {
        this.isBelongInvalidList = isBelongInvalidList;
    }

    public void setLastTempItem(boolean isLastTempItem) {
        this.isLastTempItem = isLastTempItem;
    }

    private double distance;

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    private String shop_pic_path;

    public String getShop_pic_path() {
        return shop_pic_path;
    }

    public void setShop_pic_path(String shop_pic_path) {
        this.shop_pic_path = shop_pic_path;
    }

    private String binds;
    /*
     * 类目
     */
    private Long cid;
    private Long sellercat;


    private String cat_name;

    private String customerProps;
    /*
     * 商品描述
     */
    private String desc;
    private String extraInfo;
    /*
     * 图片信息
     */
    private FileItem image;

    private String imageurl;
    /*
     * 商品名
     */
    private String name;
    private String status;
    private String unit;
    private String barcode;
    /*
     * 外部编码
     */
    private String outerId;
    /*
     * 包装清单
     */
    private String packingList;
    /*
     * 卖价
     */
    private Double price;
    /***
     * 进货价
     */
    private Double purchase_price;
    /***
     * 供应商id
     */
    private Long supplier_id;

    private String propertyAlias;
    /*
     * 关键属性
     * 结构:pid:vid;pid:vid.调用taobao.itemprops.get获取pid,调用taobao.itempropvalues
     * .get获取vid;如果碰到用户自定义属性,请用customer_props.
     */
    private String props;
    /*
     * 销售属性
     */
    private String saleProps;
    /*
     * 商品卖点描述
     */
    private String sellPt = "";

    private Long templateId;

    private Integer num;

    private Long pid;

    private Long product_id;

    // 外部id 比如手机的IMEI号
    private List<String> out_ids;

    private List<ProductProperty> pvlist;

    // 门店销量
    private Integer sale_num;
    // 图片信息
    private List<ProductPropImg> product_prop_imgs;
    // 是否显示库存
    private boolean is_show_num;
    // 促销信息
    private Product_prom prominfo;

    // 店长推荐
    private Integer has_showcase;
    // 是否是虚拟产品
    private int is_virtual;

    // 创建时间
    private String created;

    private int sort;

    /**
     * 是否是关注商品
     **/
    private boolean attention;

    //是否有套餐
    private boolean suite;

    private ProductSuite psuite;

    /**
     * 销量标志
     **/
    private String num_flag = "";

    /**
     * 库存标志
     **/
    private String stock_flag = "";

    private String shop_address = "";

    public long cart_id;

    //商品浏览量
    private long views_num = 0;

    public ProductSuite getPsuite() {
        return psuite;
    }

    public void setPsuite(ProductSuite psuite) {
        this.psuite = psuite;
    }

    public boolean isSuite() {
        return suite;
    }

    public void setSuite(boolean suite) {
        this.suite = suite;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
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

    public void setCid(long cid) {
        this.cid = cid;
    }

    public List<ProductProperty> getPvlist() {
        return pvlist;
    }

    public void setPvlist(List<ProductProperty> pvlist) {
        this.pvlist = pvlist;
    }

    public String getBinds() {
        return binds;
    }

    public void setBinds(String binds) {
        this.binds = binds;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCustomerProps() {
        return customerProps;
    }

    public void setCustomerProps(String customerProps) {
        this.customerProps = customerProps;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public FileItem getImage() {
        return image;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getPackingList() {
        return packingList;
    }

    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPropertyAlias() {
        return propertyAlias;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getSaleProps() {
        return saleProps;
    }

    public void setSaleProps(String saleProps) {
        this.saleProps = saleProps;
    }

    public String getSellPt() {
        return sellPt;
    }

    public void setSellPt(String sellPt) {
        this.sellPt = sellPt;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public List<String> getOut_ids() {
        return out_ids;
    }

    public void setOut_ids(List<String> out_ids) {
        this.out_ids = out_ids;
    }

    public Double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public List<ProductPropImg> getProduct_prop_imgs() {
        return product_prop_imgs;
    }

    public void setProduct_prop_imgs(List<ProductPropImg> product_prop_imgs) {
        this.product_prop_imgs = product_prop_imgs;
    }

    public boolean isIs_show_num() {
        return is_show_num;
    }

    public void setIs_show_num(boolean is_show_num) {
        this.is_show_num = is_show_num;
    }

    public Product_prom getProminfo() {
        return prominfo;
    }

    public void setProminfo(Product_prom prominfo) {
        this.prominfo = prominfo;
    }

    public Integer getSale_num() {
        return sale_num;
    }

    public void setSale_num(Integer sale_num) {
        this.sale_num = sale_num;
    }

    public Integer getHas_showcase() {
        return has_showcase;
    }

    public void setHas_showcase(Integer has_showcase) {
        this.has_showcase = has_showcase;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getIs_virtual() {
        return is_virtual;
    }

    public void setIs_virtual(int is_virtual) {
        this.is_virtual = is_virtual;
    }

    public Long getSellercat() {
        return sellercat;
    }

    public void setSellercat(Long sellercat) {
        this.sellercat = sellercat;
    }

    public boolean isAttention() {
        return attention;
    }

    public void setAttention(boolean attention) {
        this.attention = attention;
    }

    /**
     * @return the num_flag
     */
    public String getNum_flag() {
        return num_flag;
    }

    /**
     * @param num_flag the num_flag to set
     */
    public void setNum_flag(String num_flag) {
        this.num_flag = num_flag;
    }

    /**
     * @return the stock_flag
     */
    public String getStock_flag() {
        return stock_flag;
    }

    /**
     * @param stock_flag the stock_flag to set
     */
    public void setStock_flag(String stock_flag) {
        this.stock_flag = stock_flag;
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
     * @return the shop_address
     */
    public String getShop_address() {
        return shop_address;
    }

    /**
     * @param shop_address the shop_address to set
     */
    public void setShop_address(String shop_address) {
        this.shop_address = shop_address;
    }

    /**
     * 是否是编辑状态
     */
    private boolean isEditing;
    /**
     * 是否被选中
     */
    private boolean isChildSelected;

    /**
     * 是否是失效列表的子项
     */
    private boolean isInvalidItem;

    /**
     * 是否属于
     */
    private boolean isBelongInvalidList;

    /**
     * 临时解决方案，为了避免尾部重绘两次，增加一个虚ITEM，不显示，但是没有子项的组项，会有一条黑线，所以需要做特殊处理
     */
    private boolean isLastTempItem;

    public boolean isEditing() {
        return isEditing;
    }

    public void setIsEditing(boolean isEditing) {
        this.isEditing = isEditing;
    }

    public boolean isChildSelected() {
        return isChildSelected;
    }

    public void setIsChildSelected(boolean isChildSelected) {
        this.isChildSelected = isChildSelected;
    }

    public boolean isInvalidItem() {
        return isInvalidItem;
    }

    public void setIsInvalidItem(boolean isInvalidItem) {
        this.isInvalidItem = isInvalidItem;
    }

    public boolean isBelongInvalidList() {
        return isBelongInvalidList;
    }

    public void setIsBelongInvalidList(boolean isBelongInvalidList) {
        this.isBelongInvalidList = isBelongInvalidList;
    }

    public boolean isLastTempItem() {
        return isLastTempItem;
    }

    public void setIsLastTempItem(boolean isLastTempItem) {
        this.isLastTempItem = isLastTempItem;
    }

    public long getCart_id() {
        return cart_id;
    }

    public void setCart_id(long cart_id) {
        this.cart_id = cart_id;
    }


    public long getViews_num() {
        return views_num;
    }

    public void setViews_num(long views_num) {
        this.views_num = views_num;
    }
}
