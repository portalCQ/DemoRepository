package com.example.demo.entity;

import java.util.Date;

public class UnionStaff {
    private Integer staffPk;

    private Integer unionPk;

    private String staffName;

    private Integer staffSex;

    private Date staffBirthday;

    private String staffAddress;

    private String staffPhone;

    private String staffId;

    private String staffEmail;

    private String remark;

    public Integer getStaffPk() {
        return staffPk;
    }

    public void setStaffPk(Integer staffPk) {
        this.staffPk = staffPk;
    }

    public Integer getUnionPk() {
        return unionPk;
    }

    public void setUnionPk(Integer unionPk) {
        this.unionPk = unionPk;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Integer getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(Integer staffSex) {
        this.staffSex = staffSex;
    }

    public Date getStaffBirthday() {
        return staffBirthday;
    }

    public void setStaffBirthday(Date staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress == null ? null : staffAddress.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail == null ? null : staffEmail.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}