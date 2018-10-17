package com.supply.supplymanage.entity;

import java.util.Date;

public class Detector {
    private Integer deteid;

    private Integer changrid;

    private Integer sizeid;

    private Integer tinctid;

    private Integer usersid;

    private Integer clid;

    private Integer designid;

    private Integer haoid;

    private Date detedate;

    private String detecode;

    private String detejiancode;

    private String detestate;

    public Integer getDeteid() {
        return deteid;
    }

    public void setDeteid(Integer deteid) {
        this.deteid = deteid;
    }

    public Integer getChangrid() {
        return changrid;
    }

    public void setChangrid(Integer changrid) {
        this.changrid = changrid;
    }

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
    }

    public Integer getTinctid() {
        return tinctid;
    }

    public void setTinctid(Integer tinctid) {
        this.tinctid = tinctid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
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

    public Date getDetedate() {
        return detedate;
    }

    public void setDetedate(Date detedate) {
        this.detedate = detedate;
    }

    public String getDetecode() {
        return detecode;
    }

    public void setDetecode(String detecode) {
        this.detecode = detecode == null ? null : detecode.trim();
    }

    public String getDetejiancode() {
        return detejiancode;
    }

    public void setDetejiancode(String detejiancode) {
        this.detejiancode = detejiancode == null ? null : detejiancode.trim();
    }

    public String getDetestate() {
        return detestate;
    }

    public void setDetestate(String detestate) {
        this.detestate = detestate == null ? null : detestate.trim();
    }
}