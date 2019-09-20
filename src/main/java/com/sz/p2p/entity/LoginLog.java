package com.sz.p2p.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 登录日志记录表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_login_log")
public class LoginLog extends Model<LoginLog> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录日志记录id
     */
    @TableId(value = "LOGIN_LOG_ID", type = IdType.AUTO)
    private Double loginLogId;
    /**
     * 用户id
     */
    private Double userId;
    /**
     * 登录IP
     */
    private String loginIp;
    /**
     * 登录时间
     */
    private Date loginTime;


    public Double getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Double loginLogId) {
        this.loginLogId = loginLogId;
    }

    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.loginLogId;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
        ", loginLogId=" + loginLogId +
        ", userId=" + userId +
        ", loginIp=" + loginIp +
        ", loginTime=" + loginTime +
        "}";
    }
}
