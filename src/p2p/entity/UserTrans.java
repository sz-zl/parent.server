package com.sz.p2p.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户交易表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_user_trans")
public class UserTrans extends Model<UserTrans> {

    private static final long serialVersionUID = 1L;

    /**
     * 交易编号
     */
    @TableId(value = "TRANS_ID", type = IdType.AUTO)
    private Double transId;
    /**
     * 用户id
     */
    private Double userId;
    /**
     * 业务名称（投资散标，债权转让，充值，提现，还款）
     */
    private String business;
    /**
     * 交易金额
     */
    private Double transMon;
    /**
     * 交易时间
     */
    private Date transDate;
    /**
     * 手续费
     */
    private Double fee;
    /**
     * 交易对象名称
     */
    private String transObj;
    /**
     * 交易对象账号
     */
    private String transAccount;
    /**
     * 结果
     */
    private Double status;


    public Double getTransId() {
        return transId;
    }

    public void setTransId(Double transId) {
        this.transId = transId;
    }

    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public Double getTransMon() {
        return transMon;
    }

    public void setTransMon(Double transMon) {
        this.transMon = transMon;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getTransObj() {
        return transObj;
    }

    public void setTransObj(String transObj) {
        this.transObj = transObj;
    }

    public String getTransAccount() {
        return transAccount;
    }

    public void setTransAccount(String transAccount) {
        this.transAccount = transAccount;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.transId;
    }

    @Override
    public String toString() {
        return "UserTrans{" +
        ", transId=" + transId +
        ", userId=" + userId +
        ", business=" + business +
        ", transMon=" + transMon +
        ", transDate=" + transDate +
        ", fee=" + fee +
        ", transObj=" + transObj +
        ", transAccount=" + transAccount +
        ", status=" + status +
        "}";
    }
}
