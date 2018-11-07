package com.example.demo.entity;

import java.util.Date;

public class UserCollection {
    private Integer collectPk;

    private Integer userPk;

    private Integer goodsPk;

    private Date collectTime;

    private String collectReserve1;

    private String collectReserve2;

    private String remark;

    public Integer getCollectPk() {
        return collectPk;
    }

    public void setCollectPk(Integer collectPk) {
        this.collectPk = collectPk;
    }

    public Integer getUserPk() {
        return userPk;
    }

    public void setUserPk(Integer userPk) {
        this.userPk = userPk;
    }

    public Integer getGoodsPk() {
        return goodsPk;
    }

    public void setGoodsPk(Integer goodsPk) {
        this.goodsPk = goodsPk;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public String getCollectReserve1() {
        return collectReserve1;
    }

    public void setCollectReserve1(String collectReserve1) {
        this.collectReserve1 = collectReserve1 == null ? null : collectReserve1.trim();
    }

    public String getCollectReserve2() {
        return collectReserve2;
    }

    public void setCollectReserve2(String collectReserve2) {
        this.collectReserve2 = collectReserve2 == null ? null : collectReserve2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}