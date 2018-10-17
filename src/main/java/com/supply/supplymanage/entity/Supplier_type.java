package com.supply.supplymanage.entity;

public class Supplier_type {
    private Integer sutypeid;

    private String sutyname;

    private String rmark;

    public Integer getSutypeid() {
        return sutypeid;
    }

    public void setSutypeid(Integer sutypeid) {
        this.sutypeid = sutypeid;
    }

    public String getSutyname() {
        return sutyname;
    }

    public void setSutyname(String sutyname) {
        this.sutyname = sutyname == null ? null : sutyname.trim();
    }

    public String getRmark() {
        return rmark;
    }

    public void setRmark(String rmark) {
        this.rmark = rmark == null ? null : rmark.trim();
    }
}