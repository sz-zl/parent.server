package com.sz.p2p.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 还款计划表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_ret_mon_plan")
public class RetmonPlan extends Model<RetmonPlan> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 还款计划Id
     */
    @TableId(value = "RET_MON_ID", type = IdType.AUTO)
    private Double retMonId;
    /**
     * 用户ID
     */
    private Double userId;
    /**
     * 债权ID
     */
    private Double claimId;
    /**
     * 用户还款方式
     */
    private String retMonWay;
    /**
     * 还款金额
     */
    private Double retMonNum;
    /**
     * 每月用户还款日期
     */
    private Date retMonDate;
    /**
     * 还款手续费
     */
    private Double retMonFee;
    /**
     * 还款期数
     */
    private Double retMonDateNum;
    /**
     * 还款状态（已还款、还款中、逾期、未进行）
     */
    private Double status;
    /**
     * 总还款金额（借款金额*（1+利率））
     */
    private Double totleRetMon;
    /**
     * 剩余还款总金额
     */
    private Double lastRetMon;


    public Double getRetMonId() {
        return retMonId;
    }

    public void setRetMonId(Double retMonId) {
        this.retMonId = retMonId;
    }

    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public Double getClaimId() {
        return claimId;
    }

    public void setClaimId(Double claimId) {
        this.claimId = claimId;
    }

    public String getRetMonWay() {
        return retMonWay;
    }

    public void setRetMonWay(String retMonWay) {
        this.retMonWay = retMonWay;
    }

    public Double getRetMonNum() {
        return retMonNum;
    }

    public void setRetMonNum(Double retMonNum) {
        this.retMonNum = retMonNum;
    }

    public Date getRetMonDate() {
        return retMonDate;
    }

    public void setRetMonDate(Date retMonDate) {
        this.retMonDate = retMonDate;
    }

    public Double getRetMonFee() {
        return retMonFee;
    }

    public void setRetMonFee(Double retMonFee) {
        this.retMonFee = retMonFee;
    }

    public Double getRetMonDateNum() {
        return retMonDateNum;
    }

    public void setRetMonDateNum(Double retMonDateNum) {
        this.retMonDateNum = retMonDateNum;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public Double getTotleRetMon() {
        return totleRetMon;
    }

    public void setTotleRetMon(Double totleRetMon) {
        this.totleRetMon = totleRetMon;
    }

    public Double getLastRetMon() {
        return lastRetMon;
    }

    public void setLastRetMon(Double lastRetMon) {
        this.lastRetMon = lastRetMon;
    }

    @Override
    protected Serializable pkVal() {
        return this.retMonId;
    }

    @Override
    public String toString() {
        return "RetmonPlan{" +
        ", retMonId=" + retMonId +
        ", userId=" + userId +
        ", claimId=" + claimId +
        ", retMonWay=" + retMonWay +
        ", retMonNum=" + retMonNum +
        ", retMonDate=" + retMonDate +
        ", retMonFee=" + retMonFee +
        ", retMonDateNum=" + retMonDateNum +
        ", status=" + status +
        ", totleRetMon=" + totleRetMon +
        ", lastRetMon=" + lastRetMon +
        "}";
    }
}
