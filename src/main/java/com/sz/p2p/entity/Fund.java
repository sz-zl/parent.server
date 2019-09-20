package com.sz.p2p.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 投资表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_fund")
public class Fund extends Model<Fund> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 投资表ID
     */
    @TableId(value = "FUND_NO", type = IdType.AUTO)
    private Double fundNo;
    /**
     * 用户ID
     */
    private Double userId;
    /**
     * 散标ID
     */
    private Double loanId;
    /**
     * 投资金额
     */
    private Double fundMon;
    /**
     * 回款年利率（和散标年利率一样）
     */
    private String yearInterestRate;
    /**
     * 投资天数
     */
    private Double fundDay;
    /**
     * 总天数
     */
    private Double totleDay;
    /**
     * 回款日期
     */
    private Date paybackDate;
    /**
     * 回款金额
     */
    private Double paybackMon;
    /**
     * 日收益
     */
    private Double incomeDay;
    /**
     * 年收益
     */
    private Double incomeYear;
    /**
     * 总收益
     */
    private Double incomeTotle;


    public Double getFundNo() {
        return fundNo;
    }

    public void setFundNo(Double fundNo) {
        this.fundNo = fundNo;
    }

    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public Double getLoanId() {
        return loanId;
    }

    public void setLoanId(Double loanId) {
        this.loanId = loanId;
    }

    public Double getFundMon() {
        return fundMon;
    }

    public void setFundMon(Double fundMon) {
        this.fundMon = fundMon;
    }

    public String getYearInterestRate() {
        return yearInterestRate;
    }

    public void setYearInterestRate(String yearInterestRate) {
        this.yearInterestRate = yearInterestRate;
    }

    public Double getFundDay() {
        return fundDay;
    }

    public void setFundDay(Double fundDay) {
        this.fundDay = fundDay;
    }

    public Double getTotleDay() {
        return totleDay;
    }

    public void setTotleDay(Double totleDay) {
        this.totleDay = totleDay;
    }

    public Date getPaybackDate() {
        return paybackDate;
    }

    public void setPaybackDate(Date paybackDate) {
        this.paybackDate = paybackDate;
    }

    public Double getPaybackMon() {
        return paybackMon;
    }

    public void setPaybackMon(Double paybackMon) {
        this.paybackMon = paybackMon;
    }

    public Double getIncomeDay() {
        return incomeDay;
    }

    public void setIncomeDay(Double incomeDay) {
        this.incomeDay = incomeDay;
    }

    public Double getIncomeYear() {
        return incomeYear;
    }

    public void setIncomeYear(Double incomeYear) {
        this.incomeYear = incomeYear;
    }

    public Double getIncomeTotle() {
        return incomeTotle;
    }

    public void setIncomeTotle(Double incomeTotle) {
        this.incomeTotle = incomeTotle;
    }

    @Override
    protected Serializable pkVal() {
        return this.fundNo;
    }

    @Override
    public String toString() {
        return "Fund{" +
        ", fundNo=" + fundNo +
        ", userId=" + userId +
        ", loanId=" + loanId +
        ", fundMon=" + fundMon +
        ", yearInterestRate=" + yearInterestRate +
        ", fundDay=" + fundDay +
        ", totleDay=" + totleDay +
        ", paybackDate=" + paybackDate +
        ", paybackMon=" + paybackMon +
        ", incomeDay=" + incomeDay +
        ", incomeYear=" + incomeYear +
        ", incomeTotle=" + incomeTotle +
        "}";
    }
}
