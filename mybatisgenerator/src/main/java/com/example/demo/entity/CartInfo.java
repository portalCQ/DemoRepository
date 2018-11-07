package com.example.demo.entity;

public class CartInfo {
    private Integer cartPk;

    private String goodsList;

    private String goodsNum;

    private String cartReserve1;

    private String cartReserve2;

    private String remark;

    public Integer getCartPk() {
        return cartPk;
    }

    public void setCartPk(Integer cartPk) {
        this.cartPk = cartPk;
    }

    public String getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(String goodsList) {
        this.goodsList = goodsList == null ? null : goodsList.trim();
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum == null ? null : goodsNum.trim();
    }

    public String getCartReserve1() {
        return cartReserve1;
    }

    public void setCartReserve1(String cartReserve1) {
        this.cartReserve1 = cartReserve1 == null ? null : cartReserve1.trim();
    }

    public String getCartReserve2() {
        return cartReserve2;
    }

    public void setCartReserve2(String cartReserve2) {
        this.cartReserve2 = cartReserve2 == null ? null : cartReserve2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}