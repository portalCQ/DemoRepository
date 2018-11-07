package com.example.demo.entity;

public class GoodsInfoWithBLOBs extends GoodsInfo {
    private String goodsReserve2;

    private String remark;

    public String getGoodsReserve2() {
        return goodsReserve2;
    }

    public void setGoodsReserve2(String goodsReserve2) {
        this.goodsReserve2 = goodsReserve2 == null ? null : goodsReserve2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}