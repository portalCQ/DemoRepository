package com.example.demo.entity;

import java.util.Date;

public class UserComments {
    private Integer commPk;

    private Integer userPk;

    private Integer goodsPk;

    private Integer commRank;

    private Date commTime;

    private String commReserve1;

    private String commReserve2;

    private String remark;

    private String commText;

    public Integer getCommPk() {
        return commPk;
    }

    public void setCommPk(Integer commPk) {
        this.commPk = commPk;
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

    public Integer getCommRank() {
        return commRank;
    }

    public void setCommRank(Integer commRank) {
        this.commRank = commRank;
    }

    public Date getCommTime() {
        return commTime;
    }

    public void setCommTime(Date commTime) {
        this.commTime = commTime;
    }

    public String getCommReserve1() {
        return commReserve1;
    }

    public void setCommReserve1(String commReserve1) {
        this.commReserve1 = commReserve1 == null ? null : commReserve1.trim();
    }

    public String getCommReserve2() {
        return commReserve2;
    }

    public void setCommReserve2(String commReserve2) {
        this.commReserve2 = commReserve2 == null ? null : commReserve2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCommText() {
        return commText;
    }

    public void setCommText(String commText) {
        this.commText = commText == null ? null : commText.trim();
    }
}