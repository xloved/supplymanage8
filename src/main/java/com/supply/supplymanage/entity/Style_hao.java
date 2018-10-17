package com.supply.supplymanage.entity;

public class Style_hao {
    private Integer haoid;

    private Integer haoname;

    private String haormark;

    private Integer eorid;

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public Integer getHaoname() {
        return haoname;
    }

    public void setHaoname(Integer haoname) {
        this.haoname = haoname;
    }

    public String getHaormark() {
        return haormark;
    }

    public void setHaormark(String haormark) {
        this.haormark = haormark == null ? null : haormark.trim();
    }

    public Integer getEorid() {
        return eorid;
    }

    public void setEorid(Integer eorid) {
        this.eorid = eorid;
    }
}