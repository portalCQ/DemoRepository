package com.example.demo.entity;

import java.util.Date;

public class OrderInfo {
    private Integer orderPk;

    private Integer userPk;

    private String orderId;

    private String orderNo;

    private String goodsList;

    private String goodsNum;

    private String goodsPrices;

    private Date orderTime;

    private Boolean orderIspay;

    private Date orderPaytime;

    private Float orderPayprice;

    private Integer orderState;

    private String orderTracknum;

    private String orderCompany;

    private String orderWebsite;

    private Integer orderAftersale;

    private String orderReserve1;

    private String orderReserve2;

    private String remark;

    public Integer getOrderPk() {
        return orderPk;
    }

    public void setOrderPk(Integer orderPk) {
        this.orderPk = orderPk;
    }

    public Integer getUserPk() {
        return userPk;
    }

    public void setUserPk(Integer userPk) {
        this.userPk = userPk;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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

    public String getGoodsPrices() {
        return goodsPrices;
    }

    public void setGoodsPrices(String goodsPrices) {
        this.goodsPrices = goodsPrices == null ? null : goodsPrices.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Boolean getOrderIspay() {
        return orderIspay;
    }

    public void setOrderIspay(Boolean orderIspay) {
        this.orderIspay = orderIspay;
    }

    public Date getOrderPaytime() {
        return orderPaytime;
    }

    public void setOrderPaytime(Date orderPaytime) {
        this.orderPaytime = orderPaytime;
    }

    public Float getOrderPayprice() {
        return orderPayprice;
    }

    public void setOrderPayprice(Float orderPayprice) {
        this.orderPayprice = orderPayprice;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderTracknum() {
        return orderTracknum;
    }

    public void setOrderTracknum(String orderTracknum) {
        this.orderTracknum = orderTracknum == null ? null : orderTracknum.trim();
    }

    public String getOrderCompany() {
        return orderCompany;
    }

    public void setOrderCompany(String orderCompany) {
        this.orderCompany = orderCompany == null ? null : orderCompany.trim();
    }

    public String getOrderWebsite() {
        return orderWebsite;
    }

    public void setOrderWebsite(String orderWebsite) {
        this.orderWebsite = orderWebsite == null ? null : orderWebsite.trim();
    }

    public Integer getOrderAftersale() {
        return orderAftersale;
    }

    public void setOrderAftersale(Integer orderAftersale) {
        this.orderAftersale = orderAftersale;
    }

    public String getOrderReserve1() {
        return orderReserve1;
    }

    public void setOrderReserve1(String orderReserve1) {
        this.orderReserve1 = orderReserve1 == null ? null : orderReserve1.trim();
    }

    public String getOrderReserve2() {
        return orderReserve2;
    }

    public void setOrderReserve2(String orderReserve2) {
        this.orderReserve2 = orderReserve2 == null ? null : orderReserve2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}