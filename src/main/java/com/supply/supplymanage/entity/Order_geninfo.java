package com.supply.supplymanage.entity;

import java.util.Date;

public class Order_geninfo {
    private Integer odgid;

    private Integer clid;

    private Integer seaid;

    private Integer designid;

    private Integer haoid;

    private Integer usersid;

    private Date odgdate;

    private String odxiaocode;

    private String odsustcode;

    private Long odgnum;

    private Date odgchidate;

    public Integer getOdgid() {
        return odgid;
    }

    public void setOdgid(Integer odgid) {
        this.odgid = odgid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
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

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public Date getOdgdate() {
        return odgdate;
    }

    public void setOdgdate(Date odgdate) {
        this.odgdate = odgdate;
    }

    public String getOdxiaocode() {
        return odxiaocode;
    }

    public void setOdxiaocode(String odxiaocode) {
        this.odxiaocode = odxiaocode == null ? null : odxiaocode.trim();
    }

    public String getOdsustcode() {
        return odsustcode;
    }

    public void setOdsustcode(String odsustcode) {
        this.odsustcode = odsustcode == null ? null : odsustcode.trim();
    }

    public Long getOdgnum() {
        return odgnum;
    }

    public void setOdgnum(Long odgnum) {
        this.odgnum = odgnum;
    }

    public Date getOdgchidate() {
        return odgchidate;
    }

    public void setOdgchidate(Date odgchidate) {
        this.odgchidate = odgchidate;
    }
}