package com.example.demo.entity;

public class DeliveryAddress {
    private Integer delivPk;

    private String delivCell;

    private String delivName;

    private String delivAddress;

    private String delivZipcode;

    private String remark;

    public Integer getDelivPk() {
        return delivPk;
    }

    public void setDelivPk(Integer delivPk) {
        this.delivPk = delivPk;
    }

    public String getDelivCell() {
        return delivCell;
    }

    public void setDelivCell(String delivCell) {
        this.delivCell = delivCell == null ? null : delivCell.trim();
    }

    public String getDelivName() {
        return delivName;
    }

    public void setDelivName(String delivName) {
        this.delivName = delivName == null ? null : delivName.trim();
    }

    public String getDelivAddress() {
        return delivAddress;
    }

    public void setDelivAddress(String delivAddress) {
        this.delivAddress = delivAddress == null ? null : delivAddress.trim();
    }

    public String getDelivZipcode() {
        return delivZipcode;
    }

    public void setDelivZipcode(String delivZipcode) {
        this.delivZipcode = delivZipcode == null ? null : delivZipcode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}