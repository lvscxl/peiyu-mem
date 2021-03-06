package com.peiyu.mem.domian.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/11/23.
 * 优惠券组
 */
public class CpActsubGroup implements Serializable {
    private String  businessName;//商家名称
    private String organOrStoreCode;//机构或者门店编号
    private String organOrStoreName;//机构或者门店名称
    private String detailCode;//限制详情编码
    private String detailName;//限制详情名称

    private List<String> organOrStoreList;//限制机构或者门店
    private List<String>detailList;//限制详情
    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public String getOrganOrStoreCode() {
        return organOrStoreCode;
    }

    public void setOrganOrStoreCode(String organOrStoreCode) {
        this.organOrStoreCode = organOrStoreCode;
    }

    public String getOrganOrStoreName() {
        return organOrStoreName;
    }

    public void setOrganOrStoreName(String organOrStoreName) {
        this.organOrStoreName = organOrStoreName;
    }

    public String getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    /**
     *<br/>
     **/
    private Long id;

    /**
     *<br/>
     **/
    private Long vendorId;

    /**
     *活动编码<br/>
     **/
    private String actNo;

    /**
     *活动名称<br/>
     **/
    private String actName;

    /**
     *活动编码<br/>
     **/
    private String subgroupCode;

    /**
     *面值<br/>
     **/
    private Double cpValue;

    /**
     *最低消费<br/>
     **/
    private Double cpLimitValue;

    /**
     *优惠券类型(0-电子券, 1-实体券)<br/>
     **/
    private String cpType;

    /**
     *是否继承活动限制条件(0-不继承, 1-继承)<br/>
     **/
    private Integer inheritActLimit;

    /**
     *有效开始时间（什么时候开始生效）<br/>
     **/
    private Date startDate;

    /**
     *有效结束时间（什么时候开始失效）<br/>
     **/
    private Date endDate;

    /**
     *领用限制类型<br/>
     **/
    private Integer getLimitType;

    /**
     *领用限制数量<br/>
     **/
    private Short getLimitQuantity;

    /**
     *使用限制类型<br/>
     **/
    private Integer useLimitType;

    /**
     *使用限制数量<br/>
     **/
    private Short useLimitQuantity;

    /**
     *时段开始时间（07:30）<br/>
     **/
    private String startTime;

    /**
     *时段结束时间(09:30)<br/>
     **/
    private String endTime;

    /**
     *生效星期（1010111表示星期一 星期三，星期五，星期六，星期天做促销）<br/>
     **/
    private String weekFlag;

    /**
     *是否可以与其他优惠券共同使用<br/>
     **/
    private Integer allowSimt;

    /**
     *应用范围类型(0-不限制, 1-品牌, 2-品类, 3-供应商, 4-商品)<br/>
     **/
    private Integer applyScopeType;

    /**
     *使用范围类型(0-不限制, 1-机构, 2-门店)<br/>
     **/
    private Integer useScopeType;

    /**
     *备注<br/>
     **/
    private String memo;

    /**
     *创建日期<br/>
     **/
    private Date createDate;

    /**
     *修改日期<br/>
     **/
    private Date modifyDate;

    /**
     *记录创建人用户名<br/>
     **/
    private String creator;

    /**
     *是否已删除1删除 0正常<br/>
     **/
    private Integer df;

    /**
     *发放方式  0用户领取 1自动发放 2手动发放<br/>
     **/
    private Integer sendType;

    /**
     *买满金额<br/>
     **/
    private Double overMoney;

    /**
     *使用-买满金额<br/>
     **/
    private Double useOverMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cpactsubgroup
     *
     * @mbggenerated Wed Sep 16 16:32:12 CST 2015
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo == null ? null : actNo.trim();
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public String getSubgroupCode() {
        return subgroupCode;
    }

    public void setSubgroupCode(String subgroupCode) {
        this.subgroupCode = subgroupCode == null ? null : subgroupCode.trim();
    }

    public Double getCpValue() {
        return cpValue;
    }

    public void setCpValue(Double cpValue) {
        this.cpValue = cpValue;
    }

    public Double getCpLimitValue() {
        return cpLimitValue;
    }

    public void setCpLimitValue(Double cpLimitValue) {
        this.cpLimitValue = cpLimitValue;
    }
    public String getCpType() {
        return cpType;
    }

    public void setCpType(String cpType) {
        this.cpType = cpType == null ? null : cpType.trim();
    }

    public Integer getInheritActLimit() {
        return inheritActLimit;
    }

    public void setInheritActLimit(Integer inheritActLimit) {
        this.inheritActLimit = inheritActLimit;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public Integer getGetLimitType() {
        return getLimitType;
    }

    public void setGetLimitType(Integer getLimitType) {
        this.getLimitType = getLimitType;
    }

    public Short getGetLimitQuantity() {
        return getLimitQuantity;
    }

    public void setGetLimitQuantity(Short getLimitQuantity) {
        this.getLimitQuantity = getLimitQuantity;
    }


    public Integer getUseLimitType() {
        return useLimitType;
    }

    public void setUseLimitType(Integer useLimitType) {
        this.useLimitType = useLimitType;
    }


    public Short getUseLimitQuantity() {
        return useLimitQuantity;
    }

    public void setUseLimitQuantity(Short useLimitQuantity) {
        this.useLimitQuantity = useLimitQuantity;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getWeekFlag() {
        return weekFlag;
    }

    public void setWeekFlag(String weekFlag) {
        this.weekFlag = weekFlag == null ? null : weekFlag.trim();
    }

    public Integer getAllowSimt() {
        return allowSimt;
    }

    public void setAllowSimt(Integer allowSimt) {
        this.allowSimt = allowSimt;
    }

    public Integer getApplyScopeType() {
        return applyScopeType;
    }

    public void setApplyScopeType(Integer applyScopeType) {
        this.applyScopeType = applyScopeType;
    }

    public Integer getUseScopeType() {
        return useScopeType;
    }

    public void setUseScopeType(Integer useScopeType) {
        this.useScopeType = useScopeType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Integer getDf() {
        return df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }
    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Double getOverMoney() {
        return overMoney;
    }

    public void setOverMoney(Double overMoney) {
        this.overMoney = overMoney;
    }

    public Double getUseOverMoney() {
        return useOverMoney;
    }

    public void setUseOverMoney(Double useOverMoney) {
        this.useOverMoney = useOverMoney;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public List<String> getOrganOrStoreList() {
        return organOrStoreList;
    }

    public void setOrganOrStoreList(List<String> organOrStoreList) {
        this.organOrStoreList = organOrStoreList;
    }

    public List<String> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<String> detailList) {
        this.detailList = detailList;
    }
}
