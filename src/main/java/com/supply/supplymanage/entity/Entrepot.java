package com.supply.supplymanage.entity;

public class Entrepot {
    private Integer entrid;

    private Integer fpid;

    private Integer repid;

    private String entrcode;

    private String entryname;

    private String entrmark;

    public Integer getEntrid() {
        return entrid;
    }

    public void setEntrid(Integer entrid) {
        this.entrid = entrid;
    }

    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
    }

    public Integer getRepid() {
        return repid;
    }

    public void setRepid(Integer repid) {
        this.repid = repid;
    }

    public String getEntrcode() {
        return entrcode;
    }

    public void setEntrcode(String entrcode) {
        this.entrcode = entrcode == null ? null : entrcode.trim();
    }

    public String getEntryname() {
        return entryname;
    }

    public void setEntryname(String entryname) {
        this.entryname = entryname == null ? null : entryname.trim();
    }

    public String getEntrmark() {
        return entrmark;
    }

    public void setEntrmark(String entrmark) {
        this.entrmark = entrmark == null ? null : entrmark.trim();
    }
}