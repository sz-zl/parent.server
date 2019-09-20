package com.sz.p2p.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 手续费
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_fee")
public class Fee extends Model<Fee> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 手续费编号
     */
    @TableId(value = "FEE_ID", type = IdType.AUTO)
    private Double feeId;
    /**
     * 手续费
     */
    private String fee;
    /**
     * 承担者: 1 表示用户承担，0 表示平台承担
     */
    private String bear;
    /**
     * 类型（0 充值; 1提现，2.还款、3.债权转让、4.借款）
     */
    private Double type;


    public Double getFeeId() {
        return feeId;
    }

    public void setFeeId(Double feeId) {
        this.feeId = feeId;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getBear() {
        return bear;
    }

    public void setBear(String bear) {
        this.bear = bear;
    }

    public Double getType() {
        return type;
    }

    public void setType(Double type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.feeId;
    }

    @Override
    public String toString() {
        return "Fee{" +
        ", feeId=" + feeId +
        ", fee=" + fee +
        ", bear=" + bear +
        ", type=" + type +
        "}";
    }
}
