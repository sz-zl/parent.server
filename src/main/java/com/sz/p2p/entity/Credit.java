package com.sz.p2p.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 信用表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_credit")
public class Credit extends Model<Credit> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 信用表ID
     */
    @TableId(value = "CREDIT_ID", type = IdType.AUTO)
    private Double creditId;
    /**
     * 申请借款笔数
     */
    private Double appLoanNum;
    /**
     * 成功借款笔数
     */
    private Double sucLoanNum;
    /**
     * 逾期次数
     */
    private Double overdueNum;
    /**
     * 逾期金额
     */
    private Double overdueMon;
    /**
     * 总额度
     */
    private Double totleMon;
    /**
     * 可用额度
     */
    private Double availableMon;
    /**
     * 已用额度
     */
    private Double usedMon;
    /**
     * 还款笔数
     */
    private Double returnMonNum;
    /**
     * 信用卡开户个数
     */
    private Double cardOpenCount;


    public Double getCreditId() {
        return creditId;
    }

    public void setCreditId(Double creditId) {
        this.creditId = creditId;
    }

    public Double getAppLoanNum() {
        return appLoanNum;
    }

    public void setAppLoanNum(Double appLoanNum) {
        this.appLoanNum = appLoanNum;
    }

    public Double getSucLoanNum() {
        return sucLoanNum;
    }

    public void setSucLoanNum(Double sucLoanNum) {
        this.sucLoanNum = sucLoanNum;
    }

    public Double getOverdueNum() {
        return overdueNum;
    }

    public void setOverdueNum(Double overdueNum) {
        this.overdueNum = overdueNum;
    }

    public Double getOverdueMon() {
        return overdueMon;
    }

    public void setOverdueMon(Double overdueMon) {
        this.overdueMon = overdueMon;
    }

    public Double getTotleMon() {
        return totleMon;
    }

    public void setTotleMon(Double totleMon) {
        this.totleMon = totleMon;
    }

    public Double getAvailableMon() {
        return availableMon;
    }

    public void setAvailableMon(Double availableMon) {
        this.availableMon = availableMon;
    }

    public Double getUsedMon() {
        return usedMon;
    }

    public void setUsedMon(Double usedMon) {
        this.usedMon = usedMon;
    }

    public Double getReturnMonNum() {
        return returnMonNum;
    }

    public void setReturnMonNum(Double returnMonNum) {
        this.returnMonNum = returnMonNum;
    }

    public Double getCardOpenCount() {
		return cardOpenCount;
	}

	public void setCardOpenCount(Double cardOpenCount) {
		this.cardOpenCount = cardOpenCount;
	}

	@Override
    protected Serializable pkVal() {
        return this.creditId;
    }

    @Override
    public String toString() {
        return "Credit{" +
        ", creditId=" + creditId +
        ", appLoanNum=" + appLoanNum +
        ", sucLoanNum=" + sucLoanNum +
        ", overdueNum=" + overdueNum +
        ", overdueMon=" + overdueMon +
        ", totleMon=" + totleMon +
        ", availableMon=" + availableMon +
        ", usedMon=" + usedMon +
        ", returnMonNum=" + returnMonNum +
        ", cardOpenCount="+ cardOpenCount+
        "}";
    }
}
