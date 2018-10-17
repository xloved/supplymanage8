package com.supply.supplymanage.entity;

public class Storage_apply {
    private Integer storid;

    private Integer haoid;

    private Integer supinfoid;

    private Integer tinctid;

    private Integer clid;

    private Integer seaid;

    private String stortype;

    private String storcode;

    private String storecode;

    private byte[] stopo;

    public Integer getStorid() {
        return storid;
    }

    public void setStorid(Integer storid) {
        this.storid = storid;
    }

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public Integer getSupinfoid() {
        return supinfoid;
    }

    public void setSupinfoid(Integer supinfoid) {
        this.supinfoid = supinfoid;
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

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
    }

    public String getStortype() {
        return stortype;
    }

    public void setStortype(String stortype) {
        this.stortype = stortype == null ? null : stortype.trim();
    }

    public String getStorcode() {
        return storcode;
    }

    public void setStorcode(String storcode) {
        this.storcode = storcode == null ? null : storcode.trim();
    }

    public String getStorecode() {
        return storecode;
    }

    public void setStorecode(String storecode) {
        this.storecode = storecode == null ? null : storecode.trim();
    }

    public byte[] getStopo() {
        return stopo;
    }

    public void setStopo(byte[] stopo) {
        this.stopo = stopo;
    }
}