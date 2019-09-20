package com.sz.p2p.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户账户表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_user_account")
public class UserAccount extends Model<UserAccount> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户账户表ID
     */
    @TableId(value = "USER_ACCOUNT_ID", type = IdType.AUTO)
    private Double userAccountId;
    /**
     * 用户的id
     */
    private Double userId;
    /**
     * 账户总额
     */
    private Double accountTotal;
    /**
     * 账户可用金额
     */
    private Double accountBalance;
    /**
     * 账户冻结金额
     */
    private Double accountFrostBal;
    /**
     * 待收利息
     */
    private Double uninterest;
    /**
     * 已赚取利息
     */
    private Double interested;
    /**
     * 总计待收本金
     */
    private Double unprincipalTotal;
    /**
     * 申请提现金额
     */
    private Double appWithAmount;


    public Double getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Double userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public Double getAccountTotal() {
        return accountTotal;
    }

    public void setAccountTotal(Double accountTotal) {
        this.accountTotal = accountTotal;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Double getAccountFrostBal() {
        return accountFrostBal;
    }

    public void setAccountFrostBal(Double accountFrostBal) {
        this.accountFrostBal = accountFrostBal;
    }

    public Double getUninterest() {
        return uninterest;
    }

    public void setUninterest(Double uninterest) {
        this.uninterest = uninterest;
    }

    public Double getInterested() {
        return interested;
    }

    public void setInterested(Double interested) {
        this.interested = interested;
    }

    public Double getUnprincipalTotal() {
        return unprincipalTotal;
    }

    public void setUnprincipalTotal(Double unprincipalTotal) {
        this.unprincipalTotal = unprincipalTotal;
    }

    public Double getAppWithAmount() {
		return appWithAmount;
	}

	public void setAppWithAmount(Double appWithAmount) {
		this.appWithAmount = appWithAmount;
	}

	@Override
    protected Serializable pkVal() {
        return this.userAccountId;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
        ", userAccountId=" + userAccountId +
        ", userId=" + userId +
        ", accountTotal=" + accountTotal +
        ", accountBalance=" + accountBalance +
        ", accountFrostBal=" + accountFrostBal +
        ", uninterest=" + uninterest +
        ", interested=" + interested +
        ", unprincipalTotal=" + unprincipalTotal +
        ", appWith amount=" + appWithAmount +
        "}";
    }
}
