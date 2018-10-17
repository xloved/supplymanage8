package com.supply.supplymanage.entity;

public class Chica {
    private Integer cheid;

    private Integer tinctid;

    private Integer meaid;

    private Integer ingreid;

    private Integer chmaid;

    private String checode;

    private Long chenum;

    public Integer getCheid() {
        return cheid;
    }

    public void setCheid(Integer cheid) {
        this.cheid = cheid;
    }

    public Integer getTinctid() {
        return tinctid;
    }

    public void setTinctid(Integer tinctid) {
        this.tinctid = tinctid;
    }

    public Integer getMeaid() {
        return meaid;
    }

    public void setMeaid(Integer meaid) {
        this.meaid = meaid;
    }

    public Integer getIngreid() {
        return ingreid;
    }

    public void setIngreid(Integer ingreid) {
        this.ingreid = ingreid;
    }

    public Integer getChmaid() {
        return chmaid;
    }

    public void setChmaid(Integer chmaid) {
        this.chmaid = chmaid;
    }

    public String getChecode() {
        return checode;
    }

    public void setChecode(String checode) {
        this.checode = checode == null ? null : checode.trim();
    }

    public Long getChenum() {
        return chenum;
    }

    public void setChenum(Long chenum) {
        this.chenum = chenum;
    }
}