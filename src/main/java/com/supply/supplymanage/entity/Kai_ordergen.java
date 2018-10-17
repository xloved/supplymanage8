package com.supply.supplymanage.entity;

import java.util.Date;

public class Kai_ordergen {
    private Integer kgenid;

    private Integer haoid;

    private Integer designid;

    private Integer seaid;

    private Integer tinctid;

    private Integer clid;

    private String kgenimg;

    private Date kgendate;

    private Date kgenwandate;

    private String kgenrmark;

    private String kgenstate;

    public Integer getKgenid() {
        return kgenid;
    }

    public void setKgenid(Integer kgenid) {
        this.kgenid = kgenid;
    }

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public Integer getDesignid() {
        return designid;
    }

    public void setDesignid(Integer designid) {
        this.designid = designid;
    }

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
    }

    public Integer getTinctid() {
        return tinctid;
    }

    public void setTinctid(Integer tinctid) {
        this.tinctid = tinctid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getKgenimg() {
        return kgenimg;
    }

    public void setKgenimg(String kgenimg) {
        this.kgenimg = kgenimg == null ? null : kgenimg.trim();
    }

    public Date getKgendate() {
        return kgendate;
    }

    public void setKgendate(Date kgendate) {
        this.kgendate = kgendate;
    }

    public Date getKgenwandate() {
        return kgenwandate;
    }

    public void setKgenwandate(Date kgenwandate) {
        this.kgenwandate = kgenwandate;
    }

    public String getKgenrmark() {
        return kgenrmark;
    }

    public void setKgenrmark(String kgenrmark) {
        this.kgenrmark = kgenrmark == null ? null : kgenrmark.trim();
    }

    public String getKgenstate() {
        return kgenstate;
    }

    public void setKgenstate(String kgenstate) {
        this.kgenstate = kgenstate == null ? null : kgenstate.trim();
    }
}