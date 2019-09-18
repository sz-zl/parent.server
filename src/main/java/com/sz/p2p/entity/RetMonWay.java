package com.sz.p2p.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 还款方式表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_ret_mon_way")
public class RetMonWay extends Model<RetMonWay> {

    private static final long serialVersionUID = 1L;

    /**
     * 还款方式编号
     */
    @TableId(value = "RET_MON_WAY_ID", type = IdType.AUTO)
    private Double retMonWayId;
    /**
     * 还款方式
     */
    private String retMonWay;


    public Double getRetMonWayId() {
        return retMonWayId;
    }

    public void setRetMonWayId(Double retMonWayId) {
        this.retMonWayId = retMonWayId;
    }

    public String getRetMonWay() {
        return retMonWay;
    }

    public void setRetMonWay(String retMonWay) {
        this.retMonWay = retMonWay;
    }

    @Override
    protected Serializable pkVal() {
        return this.retMonWayId;
    }

    @Override
    public String toString() {
        return "RetMonWay{" +
        ", retMonWayId=" + retMonWayId +
        ", retMonWay=" + retMonWay +
        "}";
    }
}
