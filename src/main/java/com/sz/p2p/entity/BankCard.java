package com.sz.p2p.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 银行卡表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_bank_card")
public class BankCard extends Model<BankCard> {

    private static final long serialVersionUID = 1L;

    /**
     * 银行卡表ID
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private Double cardNo;
    /**
     * 用户的id
     */
    private Double userId;
    /**
     * 银行卡号
     */
    private Double cardId;
    /**
     * 开户银行
     */
    private String bank;
    /**
     * 银行支行
     */
    private String branch;
    /**
     * 银行编号
     */
    private Double bankId;
    /**
     * 银行预留手机号码
     */
    private Double reserveTel;


    public Double getCardNo() {
        return cardNo;
    }

    public void setCardNo(Double cardNo) {
        this.cardNo = cardNo;
    }

    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public Double getCardId() {
        return cardId;
    }

    public void setCardId(Double cardId) {
        this.cardId = cardId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Double getBankId() {
        return bankId;
    }

    public void setBankId(Double bankId) {
        this.bankId = bankId;
    }

    public Double getReserveTel() {
        return reserveTel;
    }

    public void setReserveTel(Double reserveTel) {
        this.reserveTel = reserveTel;
    }

    @Override
    protected Serializable pkVal() {
        return this.cardNo;
    }

    @Override
    public String toString() {
        return "BankCard{" +
        ", cardNo=" + cardNo +
        ", userId=" + userId +
        ", cardId=" + cardId +
        ", bank=" + bank +
        ", branch=" + branch +
        ", bankId=" + bankId +
        ", reserveTel=" + reserveTel +
        "}";
    }
}
