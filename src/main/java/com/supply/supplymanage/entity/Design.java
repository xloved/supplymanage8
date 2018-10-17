package com.supply.supplymanage.entity;

public class Design {
    private Integer designid;

    private Integer eorid;

    private Integer haoid;

    private Integer clothid;

    private String desname;

    private String deskuaname;

    private String desrmark;

    public Integer getDesignid() {
        return designid;
    }

    public void setDesignid(Integer designid) {
        this.designid = designid;
    }

    public Integer getEorid() {
        return eorid;
    }

    public void setEorid(Integer eorid) {
        this.eorid = eorid;
    }

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public Integer getClothid() {
        return clothid;
    }

    public void setClothid(Integer clothid) {
        this.clothid = clothid;
    }

    public String getDesname() {
        return desname;
    }

    public void setDesname(String desname) {
        this.desname = desname == null ? null : desname.trim();
    }

    public String getDeskuaname() {
        return deskuaname;
    }

    public void setDeskuaname(String deskuaname) {
        this.deskuaname = deskuaname == null ? null : deskuaname.trim();
    }

    public String getDesrmark() {
        return desrmark;
    }

    public void setDesrmark(String desrmark) {
        this.desrmark = desrmark == null ? null : desrmark.trim();
    }
}