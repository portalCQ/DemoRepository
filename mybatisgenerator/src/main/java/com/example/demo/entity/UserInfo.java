package com.example.demo.entity;

import java.util.Date;

public class UserInfo {
    private Integer userPk;

    private String userPassword;

    private String userName;

    private String userCell;

    private String userEmail;

    private Integer userSex;

    private Date userRegtime;

    private String userRealname;

    private String userId;

    private String userMark;

    private String userReserve1;

    private String userReserve2;

    private String remark;

    public Integer getUserPk() {
        return userPk;
    }

    public void setUserPk(Integer userPk) {
        this.userPk = userPk;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCell() {
        return userCell;
    }

    public void setUserCell(String userCell) {
        this.userCell = userCell == null ? null : userCell.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Date getUserRegtime() {
        return userRegtime;
    }

    public void setUserRegtime(Date userRegtime) {
        this.userRegtime = userRegtime;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserMark() {
        return userMark;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark == null ? null : userMark.trim();
    }

    public String getUserReserve1() {
        return userReserve1;
    }

    public void setUserReserve1(String userReserve1) {
        this.userReserve1 = userReserve1 == null ? null : userReserve1.trim();
    }

    public String getUserReserve2() {
        return userReserve2;
    }

    public void setUserReserve2(String userReserve2) {
        this.userReserve2 = userReserve2 == null ? null : userReserve2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}