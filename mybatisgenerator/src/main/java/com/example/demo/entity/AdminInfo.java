package com.example.demo.entity;

public class AdminInfo {
    private Integer adminPk;

    private String adminPassword;

    private String adminName;

    private String adminCell;

    private String adminEmail;

    private String remark;

    public Integer getAdminPk() {
        return adminPk;
    }

    public void setAdminPk(Integer adminPk) {
        this.adminPk = adminPk;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminCell() {
        return adminCell;
    }

    public void setAdminCell(String adminCell) {
        this.adminCell = adminCell == null ? null : adminCell.trim();
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}