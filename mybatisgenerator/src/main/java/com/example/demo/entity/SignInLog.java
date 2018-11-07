package com.example.demo.entity;

import java.util.Date;

public class SignInLog {
    private Integer signinPk;

    private Boolean signinIsadmin;

    private Integer userPk;

    private Integer adminPk;

    private Date signinTime;

    private String signinReserve1;

    private String signinReserve2;

    private String remark;

    public Integer getSigninPk() {
        return signinPk;
    }

    public void setSigninPk(Integer signinPk) {
        this.signinPk = signinPk;
    }

    public Boolean getSigninIsadmin() {
        return signinIsadmin;
    }

    public void setSigninIsadmin(Boolean signinIsadmin) {
        this.signinIsadmin = signinIsadmin;
    }

    public Integer getUserPk() {
        return userPk;
    }

    public void setUserPk(Integer userPk) {
        this.userPk = userPk;
    }

    public Integer getAdminPk() {
        return adminPk;
    }

    public void setAdminPk(Integer adminPk) {
        this.adminPk = adminPk;
    }

    public Date getSigninTime() {
        return signinTime;
    }

    public void setSigninTime(Date signinTime) {
        this.signinTime = signinTime;
    }

    public String getSigninReserve1() {
        return signinReserve1;
    }

    public void setSigninReserve1(String signinReserve1) {
        this.signinReserve1 = signinReserve1 == null ? null : signinReserve1.trim();
    }

    public String getSigninReserve2() {
        return signinReserve2;
    }

    public void setSigninReserve2(String signinReserve2) {
        this.signinReserve2 = signinReserve2 == null ? null : signinReserve2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}