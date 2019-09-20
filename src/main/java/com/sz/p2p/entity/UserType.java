package com.sz.p2p.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户类型表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_user_type")
public class UserType extends Model<UserType> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户类型id
     */
    @TableId(value = "USER_TYPE_NO", type = IdType.AUTO)
    private Double userTypeNo;
    /**
     * 用户类型编号
     */
    private Double userTypeId;
    /**
     * 名称（出借人，借款人）
     */
    private String userTypeName;


    public Double getUserTypeNo() {
        return userTypeNo;
    }

    public void setUserTypeNo(Double userTypeNo) {
        this.userTypeNo = userTypeNo;
    }

    public Double getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Double userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    @Override
    protected Serializable pkVal() {
        return this.userTypeNo;
    }

    @Override
    public String toString() {
        return "UserType{" +
        ", userTypeNo=" + userTypeNo +
        ", userTypeId=" + userTypeId +
        ", userTypeName=" + userTypeName +
        "}";
    }
}
