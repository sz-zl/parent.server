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
 * 借款/散标表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_loan")
public class Loan extends Model<Loan> {

	private static final long serialVersionUID = 1L;

	/**
	 * 散标表ID
	 */
	@TableId(value = "LOAN_NO", type = IdType.INPUT)
	private Double loanNo;
	/**
	 * 散标编号
	 */
	private Double loanId;
	/**
	 * 用户ID
	 */
	private Double userId;
	@TableField(exist = false)
	private User user;
	/**
	 * 年利率
	 */
	private String yearInterestRate;
	/**
	 * 还款期限
	 */
	private Double deadline;
	/**
	 * 总金额
	 */
	private Double totleMon;
	/**
	 * 已招募金额
	 */
	private Double recruitedMon;
	/**
	 * 用途
	 */
	private String usings;
	/**
	 * （1.待审核 2.借款中 3.已满标/未满标 4.放款中 5.已放款
	 */
	private Double status;
	/**
	 * 其它负债
	 */
	private Double otherLiability;
	/**
	 * 起投金额
	 */
	private Double minMon;
	/**
	 * 还款方式:按月还款/等额本息(0,1)
	 */
	private Double returnMonWay;
	/**
	 * 还款来源
	 */
	private String returnMonSource;
	/**
	 * 具体放款日（具体债权生成日期）
	 */
	private Date getMonDay;
	/**
	 * 散标生成时间
	 */
	private Date createTime;

	public Double getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(Double loanNo) {
		this.loanNo = loanNo;
	}

	public Double getLoanId() {
		return loanId;
	}

	public void setLoanId(Double loanId) {
		this.loanId = loanId;
	}

	public Double getUserId() {
		return userId;
	}

	public void setUserId(Double userId) {
		this.userId = userId;
	}

	public String getYearInterestRate() {
		return yearInterestRate;
	}

	public void setYearInterestRate(String yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}

	public Double getDeadline() {
		return deadline;
	}

	public void setDeadline(Double deadline) {
		this.deadline = deadline;
	}

	public Double getTotleMon() {
		return totleMon;
	}

	public void setTotleMon(Double totleMon) {
		this.totleMon = totleMon;
	}

	public Double getRecruitedMon() {
		return recruitedMon;
	}

	public void setRecruitedMon(Double recruitedMon) {
		this.recruitedMon = recruitedMon;
	}

	public String getUsings() {
		return usings;
	}

	public void setUsings(String usings) {
		this.usings = usings;
	}

	public Double getStatus() {
		return status;
	}

	public void setStatus(Double status) {
		this.status = status;
	}

	public Double getOtherLiability() {
		return otherLiability;
	}

	public void setOtherLiability(Double otherLiability) {
		this.otherLiability = otherLiability;
	}

	public Double getMinMon() {
		return minMon;
	}

	public void setMinMon(Double minMon) {
		this.minMon = minMon;
	}

	public Double getReturnMonWay() {
		return returnMonWay;
	}

	public void setReturnMonWay(Double returnMonWay) {
		this.returnMonWay = returnMonWay;
	}

	public String getReturnMonSource() {
		return returnMonSource;
	}

	public void setReturnMonSource(String returnMonSource) {
		this.returnMonSource = returnMonSource;
	}

	public Date getGetMonDay() {
		return getMonDay;
	}

	public void setGetMonDay(Date getMonDay) {
		this.getMonDay = getMonDay;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.loanNo;
	}

	@Override
	public String toString() {
		return "Loan [loanNo=" + loanNo + ", loanId=" + loanId + ", userId=" + userId 
				+ ", yearInterestRate=" + yearInterestRate + ", deadline=" + deadline + ", totleMon=" + totleMon
				+ ", recruitedMon=" + recruitedMon + ", usings=" + usings + ", status=" + status + ", otherLiability="
				+ otherLiability + ", minMon=" + minMon + ", returnMonWay=" + returnMonWay + ", returnMonSource="
				+ returnMonSource + ", getMonDay=" + getMonDay + ", createTime=" + createTime + "]";
	}

}
