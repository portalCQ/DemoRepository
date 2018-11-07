package com.example.demo.entity;

import java.util.Date;

public class GoodsLog {
    private Integer glPk;

    private Integer goodsPk;

    private Integer goodsIn;

    private Integer goodsOut;

    private Float goodsPricechange;

    private Date glTime;

    private String glReserve1;

    private String glReserve2;

    private String remark;

    public Integer getGlPk() {
        return glPk;
    }

    public void setGlPk(Integer glPk) {
        this.glPk = glPk;
    }

    public Integer getGoodsPk() {
        return goodsPk;
    }

    public void setGoodsPk(Integer goodsPk) {
        this.goodsPk = goodsPk;
    }

    public Integer getGoodsIn() {
        return goodsIn;
    }

    public void setGoodsIn(Integer goodsIn) {
        this.goodsIn = goodsIn;
    }

    public Integer getGoodsOut() {
        return goodsOut;
    }

    public void setGoodsOut(Integer goodsOut) {
        this.goodsOut = goodsOut;
    }

    public Float getGoodsPricechange() {
        return goodsPricechange;
    }

    public void setGoodsPricechange(Float goodsPricechange) {
        this.goodsPricechange = goodsPricechange;
    }

    public Date getGlTime() {
        return glTime;
    }

    public void setGlTime(Date glTime) {
        this.glTime = glTime;
    }

    public String getGlReserve1() {
        return glReserve1;
    }

    public void setGlReserve1(String glReserve1) {
        this.glReserve1 = glReserve1 == null ? null : glReserve1.trim();
    }

    public String getGlReserve2() {
        return glReserve2;
    }

    public void setGlReserve2(String glReserve2) {
        this.glReserve2 = glReserve2 == null ? null : glReserve2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}