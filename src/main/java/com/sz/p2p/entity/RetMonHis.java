package com.sz.p2p.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 还款历史表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_ret_mon_his")
public class RetMonHis extends Model<RetMonHis> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 记录编号
     */
    @TableId(value = "RET_MON_HIS_ID", type = IdType.AUTO)
    private Double retMonHisId;
    /**
     * 应还金额
     */
    private Double retMonNum;
    /**
     * 还款状态（还款失败、还款成功）
     */
    private Double status;
    /**
     * 历史时间
     */
    private Date hisDate;


    public Double getRetMonHisId() {
        return retMonHisId;
    }

    public void setRetMonHisId(Double retMonHisId) {
        this.retMonHisId = retMonHisId;
    }

    public Double getRetMonNum() {
        return retMonNum;
    }

    public void setRetMonNum(Double retMonNum) {
        this.retMonNum = retMonNum;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public Date getHisDate() {
        return hisDate;
    }

    public void setHisDate(Date hisDate) {
        this.hisDate = hisDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.retMonHisId;
    }

    @Override
    public String toString() {
        return "RetMonHis{" +
        ", retMonHisId=" + retMonHisId +
        ", retMonNum=" + retMonNum +
        ", status=" + status +
        ", hisDate=" + hisDate +
        "}";
    }
}
