package com.sz.p2p.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 债权表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_claim")
public class Claim extends Model<Claim> implements Serializable {

    private static final long serialVersionUID = 1L;
    
    

    public Claim() {
	}

	public Claim(Double claimNo, Double claimId, Double loanId, Loan loan, Double loanUserId, User loanUser,
			Double fundUserId, User fundUser, Double claimMon, Double returnMonDay, Double returnMonNum, Double status,
			Date claimSellTime, Date claimBuyDate, Date claimBuyTime, Date hasClaimMinTime) {
		this.claimNo = claimNo;
		this.claimId = claimId;
		this.loanId = loanId;
		this.loan = loan;
		this.loanUserId = loanUserId;
		this.loanUser = loanUser;
		this.fundUserId = fundUserId;
		this.fundUser = fundUser;
		this.claimMon = claimMon;
		this.returnMonDay = returnMonDay;
		this.returnMonNum = returnMonNum;
		this.status = status;
		this.claimSellTime = claimSellTime;
		this.claimBuyDate = claimBuyDate;
		this.claimBuyTime = claimBuyTime;
		this.hasClaimMinTime = hasClaimMinTime;
	}
    
    

	/**
     * 债权表ID
     */
    @TableId(value = "CLAIM_NO", type = IdType.INPUT)
    private Double claimNo;
    /**
     * 债权编号
     */
    private Double claimId;
    /**
     * 散标编号
     */
    private Double loanId;
    @TableField(exist = false)
    private Loan loan;
    
    public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	/**
     * 借款人编号
     */
    private Double loanUserId;
    @TableField(exist = false)
    private User loanUser;
    
    public User getLoanUser() {
		return loanUser;
	}

	public void setLoanUser(User loanUser) {
		this.loanUser = loanUser;
	}

	/**
     * 投资人编号
     */
    private Double fundUserId;
    @TableField(exist = false)
    private User fundUser;
    
    public User getFundUser() {
		return fundUser;
	}

	public void setFundUser(User fundUser) {
		this.fundUser = fundUser;
	}

	/**
     * 债权金额
     */
    private Double claimMon;
    /**
     * 还款日
     */
    private Double returnMonDay;
    /**
     * 还款金额
     */
    private Double returnMonNum;
    /**
     * 债权状态（1.持有中  2.投标中  3.转让中）
     */
    private Double status;
    /**
     * 债权转出期限
     */
    private Date claimSellTime;
    /**
     * 债权转入日期
     */
    private Date claimBuyDate;
    /**
     * 债权转入时间
     */
    private Date claimBuyTime;
    /**
     * 债权最少持有时间：（至少持有大于90天才可转让）
     */
    private Date hasClaimMinTime;


    public Double getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(Double claimNo) {
        this.claimNo = claimNo;
    }

    public Double getClaimId() {
        return claimId;
    }

    public void setClaimId(Double claimId) {
        this.claimId = claimId;
    }

    public Double getLoanId() {
        return loanId;
    }

    public void setLoanId(Double loanId) {
        this.loanId = loanId;
    }

    public Double getLoanUserId() {
        return loanUserId;
    }

    public void setLoanUserId(Double loanUserId) {
        this.loanUserId = loanUserId;
    }

    public Double getFundUserId() {
        return fundUserId;
    }

    public void setFundUserId(Double fundUserId) {
        this.fundUserId = fundUserId;
    }

    public Double getClaimMon() {
        return claimMon;
    }

    public void setClaimMon(Double claimMon) {
        this.claimMon = claimMon;
    }

    public Double getReturnMonDay() {
        return returnMonDay;
    }

    public void setReturnMonDay(Double returnMonDay) {
        this.returnMonDay = returnMonDay;
    }

    public Double getReturnMonNum() {
        return returnMonNum;
    }

    public void setReturnMonNum(Double returnMonNum) {
        this.returnMonNum = returnMonNum;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public Date getClaimSellTime() {
        return claimSellTime;
    }

    public void setClaimSellTime(Date claimSellTime) {
        this.claimSellTime = claimSellTime;
    }

    public Date getClaimBuyDate() {
        return claimBuyDate;
    }

    public void setClaimBuyDate(Date claimBuyDate) {
        this.claimBuyDate = claimBuyDate;
    }

    public Date getClaimBuyTime() {
        return claimBuyTime;
    }

    public void setClaimBuyTime(Date claimBuyTime) {
        this.claimBuyTime = claimBuyTime;
    }

    public Date getHasClaimMinTime() {
        return hasClaimMinTime;
    }

    public void setHasClaimMinTime(Date hasClaimMinTime) {
        this.hasClaimMinTime = hasClaimMinTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.claimNo;
    }

    @Override
    public String toString() {
        return "Claim{" +
        ", claimNo=" + claimNo +
        ", claimId=" + claimId +
        ", loanId=" + loanId +
        ", loanUserId=" + loanUserId +
        ", fundUserId=" + fundUserId +
        ", claimMon=" + claimMon +
        ", returnMonDay=" + returnMonDay +
        ", returnMonNum=" + returnMonNum +
        ", status=" + status +
        ", claimSellTime=" + claimSellTime +
        ", claimBuyDate=" + claimBuyDate +
        ", claimBuyTime=" + claimBuyTime +
        ", hasClaimMinTime=" + hasClaimMinTime +
        "}";
    }
}
