package com.supply.supplymanage.entity;

public class Orderinfo {
    private Integer odinfoid;

    private Integer designid;

    private Integer haoid;

    private String ordercode;

    private Long odinfonum;

    private Double odinfomoney;

    private Double odinfobuys;

    private String odinshu;

    private String odinfohour;

    private Double odinfbuy;

    private String odinrmark;

    private String odinaddres;

    public Integer getOdinfoid() {
        return odinfoid;
    }

    public void setOdinfoid(Integer odinfoid) {
        this.odinfoid = odinfoid;
    }

    public Integer getDesignid() {
        return designid;
    }

    public void setDesignid(Integer designid) {
        this.designid = designid;
    }

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    public Long getOdinfonum() {
        return odinfonum;
    }

    public void setOdinfonum(Long odinfonum) {
        this.odinfonum = odinfonum;
    }

    public Double getOdinfomoney() {
        return odinfomoney;
    }

    public void setOdinfomoney(Double odinfomoney) {
        this.odinfomoney = odinfomoney;
    }

    public Double getOdinfobuys() {
        return odinfobuys;
    }

    public void setOdinfobuys(Double odinfobuys) {
        this.odinfobuys = odinfobuys;
    }

    public String getOdinshu() {
        return odinshu;
    }

    public void setOdinshu(String odinshu) {
        this.odinshu = odinshu == null ? null : odinshu.trim();
    }

    public String getOdinfohour() {
        return odinfohour;
    }

    public void setOdinfohour(String odinfohour) {
        this.odinfohour = odinfohour == null ? null : odinfohour.trim();
    }

    public Double getOdinfbuy() {
        return odinfbuy;
    }

    public void setOdinfbuy(Double odinfbuy) {
        this.odinfbuy = odinfbuy;
    }

    public String getOdinrmark() {
        return odinrmark;
    }

    public void setOdinrmark(String odinrmark) {
        this.odinrmark = odinrmark == null ? null : odinrmark.trim();
    }

    public String getOdinaddres() {
        return odinaddres;
    }

    public void setOdinaddres(String odinaddres) {
        this.odinaddres = odinaddres == null ? null : odinaddres.trim();
    }
}