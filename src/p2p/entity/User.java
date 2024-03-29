package com.sz.p2p.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@TableName("tb_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "USER_ID", type = IdType.AUTO)
    private Double userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 手机号
     */
    private Long phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 登录密码
     */
    private String loginPwd;
    /**
     * 支付密码
     */
    private String payPwd;
    /**
     * 注册时间
     */
    private Date regTime;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 紧急联系人
     */
    private String emerContact;
    /**
     * 紧急联系人电话
     */
    private Long emerContactTel;
    /**
     * 固定电话
     */
    private Long fixedTel;
    /**
     * 常住地址
     */
    private String address;
    /**
     * 登录IP
     */
    private String loginIp;
    /**
     * 锁
     */
    private String lock;
    /**
     * 登录时间
     */
    private Date loginTime;
    /**
     * 用户类型编号
     */
    private Double userTypeId;
    /**
     * 安全等级编号
     */
    private Double safeId;


    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmerContact() {
        return emerContact;
    }

    public void setEmerContact(String emerContact) {
        this.emerContact = emerContact;
    }

    public Long getEmerContactTel() {
        return emerContactTel;
    }

    public void setEmerContactTel(Long emerContactTel) {
        this.emerContactTel = emerContactTel;
    }

    public Long getFixedTel() {
        return fixedTel;
    }

    public void setFixedTel(Long fixedTel) {
        this.fixedTel = fixedTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLock() {
        return lock;
    }

    public void setLock(String lock) {
        this.lock = lock;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Double getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Double userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Double getSafeId() {
        return safeId;
    }

    public void setSafeId(Double safeId) {
        this.safeId = safeId;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "User{" +
        ", userId=" + userId +
        ", userName=" + userName +
        ", phone=" + phone +
        ", email=" + email +
        ", loginPwd=" + loginPwd +
        ", payPwd=" + payPwd +
        ", regTime=" + regTime +
        ", idCard=" + idCard +
        ", realName=" + realName +
        ", emerContact=" + emerContact +
        ", emerContactTel=" + emerContactTel +
        ", fixedTel=" + fixedTel +
        ", address=" + address +
        ", loginIp=" + loginIp +
        ", lock=" + lock +
        ", loginTime=" + loginTime +
        ", userTypeId=" + userTypeId +
        ", safeId=" + safeId +
        "}";
    }
}
