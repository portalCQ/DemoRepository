package com.example.demo.entity;

import java.util.Date;

public class UnionInfo {
    private Integer unionPk;

    private String unionName;

    private String unionMaster;

    private String unionLicense;

    private String unionAddress;

    private Date unionEstablish;

    private Integer unionAsset;

    private String unionTele;

    private String unionCell;

    private String unionEmail;

    private String unionMark;

    private String remark;

    public Integer getUnionPk() {
        return unionPk;
    }

    public void setUnionPk(Integer unionPk) {
        this.unionPk = unionPk;
    }

    public String getUnionName() {
        return unionName;
    }

    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    public String getUnionMaster() {
        return unionMaster;
    }

    public void setUnionMaster(String unionMaster) {
        this.unionMaster = unionMaster == null ? null : unionMaster.trim();
    }

    public String getUnionLicense() {
        return unionLicense;
    }

    public void setUnionLicense(String unionLicense) {
        this.unionLicense = unionLicense == null ? null : unionLicense.trim();
    }

    public String getUnionAddress() {
        return unionAddress;
    }

    public void setUnionAddress(String unionAddress) {
        this.unionAddress = unionAddress == null ? null : unionAddress.trim();
    }

    public Date getUnionEstablish() {
        return unionEstablish;
    }

    public void setUnionEstablish(Date unionEstablish) {
        this.unionEstablish = unionEstablish;
    }

    public Integer getUnionAsset() {
        return unionAsset;
    }

    public void setUnionAsset(Integer unionAsset) {
        this.unionAsset = unionAsset;
    }

    public String getUnionTele() {
        return unionTele;
    }

    public void setUnionTele(String unionTele) {
        this.unionTele = unionTele == null ? null : unionTele.trim();
    }

    public String getUnionCell() {
        return unionCell;
    }

    public void setUnionCell(String unionCell) {
        this.unionCell = unionCell == null ? null : unionCell.trim();
    }

    public String getUnionEmail() {
        return unionEmail;
    }

    public void setUnionEmail(String unionEmail) {
        this.unionEmail = unionEmail == null ? null : unionEmail.trim();
    }

    public String getUnionMark() {
        return unionMark;
    }

    public void setUnionMark(String unionMark) {
        this.unionMark = unionMark == null ? null : unionMark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}