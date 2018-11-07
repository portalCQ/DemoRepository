package com.example.demo.entity;

import java.util.Date;

public class UnionNews {
    private Integer newsPk;

    private String newsTitle;

    private Date newsTime;

    private Integer newsMark;

    private String remark;

    private String newsText;

    public Integer getNewsPk() {
        return newsPk;
    }

    public void setNewsPk(Integer newsPk) {
        this.newsPk = newsPk;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public Date getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }

    public Integer getNewsMark() {
        return newsMark;
    }

    public void setNewsMark(Integer newsMark) {
        this.newsMark = newsMark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText == null ? null : newsText.trim();
    }
}