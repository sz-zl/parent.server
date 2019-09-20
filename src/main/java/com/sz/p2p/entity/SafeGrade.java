package com.sz.p2p.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 安全等级表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_safe_grade")
public class SafeGrade extends Model<SafeGrade> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 安全ID
     */
    @TableId(value = "SOFA_ID", type = IdType.AUTO)
    private Double sofaId;
    /**
     * 安全等级
     */
    private Double sofaGrade;


    public Double getSofaId() {
        return sofaId;
    }

    public void setSofaId(Double sofaId) {
        this.sofaId = sofaId;
    }

    public Double getSofaGrade() {
        return sofaGrade;
    }

    public void setSofaGrade(Double sofaGrade) {
        this.sofaGrade = sofaGrade;
    }

    @Override
    protected Serializable pkVal() {
        return this.sofaId;
    }

    @Override
    public String toString() {
        return "SafeGrade{" +
        ", sofaId=" + sofaId +
        ", sofaGrade=" + sofaGrade +
        "}";
    }
}
