package com.supply.supplymanage.entity;

import java.util.Date;

public class Mer_money {
    private Integer mermid;

    private Integer supid;

    private Integer tinctid;

    private String mermcode;

    private String mremgui;

    private String mermwei;

    private Double mermmoney;

    private Long mermnum;

    private Date mermdate;

    private String mermark;

    private String mermway;

    public Integer getMermid() {
        return mermid;
    }

    public void setMermid(Integer mermid) {
        this.mermid = mermid;
    }

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
    }

    public Integer getTinctid() {
        return tinctid;
    }

    public void setTinctid(Integer tinctid) {
        this.tinctid = tinctid;
    }

    public String getMermcode() {
        return mermcode;
    }

    public void setMermcode(String mermcode) {
        this.mermcode = mermcode == null ? null : mermcode.trim();
    }

    public String getMremgui() {
        return mremgui;
    }

    public void setMremgui(String mremgui) {
        this.mremgui = mremgui == null ? null : mremgui.trim();
    }

    public String getMermwei() {
        return mermwei;
    }

    public void setMermwei(String mermwei) {
        this.mermwei = mermwei == null ? null : mermwei.trim();
    }

    public Double getMermmoney() {
        return mermmoney;
    }

    public void setMermmoney(Double mermmoney) {
        this.mermmoney = mermmoney;
    }

    public Long getMermnum() {
        return mermnum;
    }

    public void setMermnum(Long mermnum) {
        this.mermnum = mermnum;
    }

    public Date getMermdate() {
        return mermdate;
    }

    public void setMermdate(Date mermdate) {
        this.mermdate = mermdate;
    }

    public String getMermark() {
        return mermark;
    }

    public void setMermark(String mermark) {
        this.mermark = mermark == null ? null : mermark.trim();
    }

    public String getMermway() {
        return mermway;
    }

    public void setMermway(String mermway) {
        this.mermway = mermway == null ? null : mermway.trim();
    }
}