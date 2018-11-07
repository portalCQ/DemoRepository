package com.example.demo.entity;

public class UnionGoodsInfo extends UnionGoodsInfoKey {
    private Integer haveArea;

    private Integer haveNum;

    private String haveYield;

    private String haveTime;

    private String havePrice;

    private String unionGoodsMark;

    private String remark;

    public Integer getHaveArea() {
        return haveArea;
    }

    public void setHaveArea(Integer haveArea) {
        this.haveArea = haveArea;
    }

    public Integer getHaveNum() {
        return haveNum;
    }

    public void setHaveNum(Integer haveNum) {
        this.haveNum = haveNum;
    }

    public String getHaveYield() {
        return haveYield;
    }

    public void setHaveYield(String haveYield) {
        this.haveYield = haveYield == null ? null : haveYield.trim();
    }

    public String getHaveTime() {
        return haveTime;
    }

    public void setHaveTime(String haveTime) {
        this.haveTime = haveTime == null ? null : haveTime.trim();
    }

    public String getHavePrice() {
        return havePrice;
    }

    public void setHavePrice(String havePrice) {
        this.havePrice = havePrice == null ? null : havePrice.trim();
    }

    public String getUnionGoodsMark() {
        return unionGoodsMark;
    }

    public void setUnionGoodsMark(String unionGoodsMark) {
        this.unionGoodsMark = unionGoodsMark == null ? null : unionGoodsMark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}