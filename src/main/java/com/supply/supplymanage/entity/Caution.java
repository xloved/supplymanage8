package com.supply.supplymanage.entity;

public class Caution {
    private Integer catid;

    private Integer tailid;

    private String catshi;

    private String catday;

    private String catyunday;

    private String catyu;

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public Integer getTailid() {
        return tailid;
    }

    public void setTailid(Integer tailid) {
        this.tailid = tailid;
    }

    public String getCatshi() {
        return catshi;
    }

    public void setCatshi(String catshi) {
        this.catshi = catshi == null ? null : catshi.trim();
    }

    public String getCatday() {
        return catday;
    }

    public void setCatday(String catday) {
        this.catday = catday == null ? null : catday.trim();
    }

    public String getCatyunday() {
        return catyunday;
    }

    public void setCatyunday(String catyunday) {
        this.catyunday = catyunday == null ? null : catyunday.trim();
    }

    public String getCatyu() {
        return catyu;
    }

    public void setCatyu(String catyu) {
        this.catyu = catyu == null ? null : catyu.trim();
    }
}