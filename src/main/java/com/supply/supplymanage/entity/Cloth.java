package com.supply.supplymanage.entity;

public class Cloth {
    private Integer clothid;

    private String clothname;

    private String clothrmark;

    public Integer getClothid() {
        return clothid;
    }

    public void setClothid(Integer clothid) {
        this.clothid = clothid;
    }

    public String getClothname() {
        return clothname;
    }

    public void setClothname(String clothname) {
        this.clothname = clothname == null ? null : clothname.trim();
    }

    public String getClothrmark() {
        return clothrmark;
    }

    public void setClothrmark(String clothrmark) {
        this.clothrmark = clothrmark == null ? null : clothrmark.trim();
    }
}