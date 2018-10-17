package com.supply.supplymanage.entity;

public class Supplies {
    private Integer supid;

    private String supname;

    private String suprmark;

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname == null ? null : supname.trim();
    }

    public String getSuprmark() {
        return suprmark;
    }

    public void setSuprmark(String suprmark) {
        this.suprmark = suprmark == null ? null : suprmark.trim();
    }
}