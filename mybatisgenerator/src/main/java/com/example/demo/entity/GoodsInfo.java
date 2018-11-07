package com.example.demo.entity;

public class GoodsInfo {
    private Integer goodsPk;

    private String goodsName;

    private Integer goodsType;

    private Integer goodsNum;

    private Float goodsPrice;

    private String goodsMark;

    private String goodsShow;

    private String goodsPicture;

    private Integer goodsSeason;

    private String goodsBlossom;

    private String goodsFruit;

    private String goodsMature;

    private String goodsExpiration;

    private String goodsReserve1;

    public Integer getGoodsPk() {
        return goodsPk;
    }

    public void setGoodsPk(Integer goodsPk) {
        this.goodsPk = goodsPk;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsMark() {
        return goodsMark;
    }

    public void setGoodsMark(String goodsMark) {
        this.goodsMark = goodsMark == null ? null : goodsMark.trim();
    }

    public String getGoodsShow() {
        return goodsShow;
    }

    public void setGoodsShow(String goodsShow) {
        this.goodsShow = goodsShow == null ? null : goodsShow.trim();
    }

    public String getGoodsPicture() {
        return goodsPicture;
    }

    public void setGoodsPicture(String goodsPicture) {
        this.goodsPicture = goodsPicture == null ? null : goodsPicture.trim();
    }

    public Integer getGoodsSeason() {
        return goodsSeason;
    }

    public void setGoodsSeason(Integer goodsSeason) {
        this.goodsSeason = goodsSeason;
    }

    public String getGoodsBlossom() {
        return goodsBlossom;
    }

    public void setGoodsBlossom(String goodsBlossom) {
        this.goodsBlossom = goodsBlossom == null ? null : goodsBlossom.trim();
    }

    public String getGoodsFruit() {
        return goodsFruit;
    }

    public void setGoodsFruit(String goodsFruit) {
        this.goodsFruit = goodsFruit == null ? null : goodsFruit.trim();
    }

    public String getGoodsMature() {
        return goodsMature;
    }

    public void setGoodsMature(String goodsMature) {
        this.goodsMature = goodsMature == null ? null : goodsMature.trim();
    }

    public String getGoodsExpiration() {
        return goodsExpiration;
    }

    public void setGoodsExpiration(String goodsExpiration) {
        this.goodsExpiration = goodsExpiration == null ? null : goodsExpiration.trim();
    }

    public String getGoodsReserve1() {
        return goodsReserve1;
    }

    public void setGoodsReserve1(String goodsReserve1) {
        this.goodsReserve1 = goodsReserve1 == null ? null : goodsReserve1.trim();
    }
}