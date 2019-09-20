package com.sz.p2p.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 银行表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_bank")
public class Bank extends Model<Bank> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 银行表ID
     */
    @TableId(value = "BANK_NO", type = IdType.AUTO)
    private Double bankNo;
    /**
     * 银行编号
     */
    private Double bankId;
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 是否停用该行
     */
    private Double disableBank;
    /**
     * 城市编号
     */
    private Double cityId;
    /**
     * 说明
     */
    private String remark;


    public Double getBankNo() {
        return bankNo;
    }

    public void setBankNo(Double bankNo) {
        this.bankNo = bankNo;
    }

    public Double getBankId() {
        return bankId;
    }

    public void setBankId(Double bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Double getDisableBank() {
        return disableBank;
    }

    public void setDisableBank(Double disableBank) {
        this.disableBank = disableBank;
    }

    public Double getCityId() {
        return cityId;
    }

    public void setCityId(Double cityId) {
        this.cityId = cityId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.bankNo;
    }

    @Override
    public String toString() {
        return "Bank{" +
        ", bankNo=" + bankNo +
        ", bankId=" + bankId +
        ", bankName=" + bankName +
        ", disableBank=" + disableBank +
        ", cityId=" + cityId +
        ", remark=" + remark +
        "}";
    }
}
