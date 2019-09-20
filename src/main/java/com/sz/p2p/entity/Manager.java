package com.sz.p2p.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author yk
 * @since 2019-09-19
 */
@TableName("tb_manager")
public class Manager extends Model<Manager> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员编号
     */
    private Integer mId;
    /**
     * 管理员账号
     */
    private String mUser;
    /**
     * 管理员密码
     */
    private String mPwd;
    /**
     * 管理员真实姓名
     */
    private String mRealName;


    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmUser() {
        return mUser;
    }

    public void setmUser(String mUser) {
        this.mUser = mUser;
    }

    public String getmPwd() {
        return mPwd;
    }

    public void setmPwd(String mPwd) {
        this.mPwd = mPwd;
    }

    public String getmRealName() {
        return mRealName;
    }

    public void setmRealName(String mRealName) {
        this.mRealName = mRealName;
    }

    @Override
    protected Serializable pkVal() {
        return this.mId;
    }

    @Override
    public String toString() {
        return "Manager{" +
        ", mId=" + mId +
        ", mUser=" + mUser +
        ", mPwd=" + mPwd +
        ", mRealName=" + mRealName +
        "}";
    }
}
