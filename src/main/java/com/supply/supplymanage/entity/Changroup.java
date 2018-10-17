package com.supply.supplymanage.entity;

public class Changroup {
    private Integer changrid;

    private String changrname;

    private String changrmark;

    public Integer getChangrid() {
        return changrid;
    }

    public void setChangrid(Integer changrid) {
        this.changrid = changrid;
    }

    public String getChangrname() {
        return changrname;
    }

    public void setChangrname(String changrname) {
        this.changrname = changrname == null ? null : changrname.trim();
    }

    public String getChangrmark() {
        return changrmark;
    }

    public void setChangrmark(String changrmark) {
        this.changrmark = changrmark == null ? null : changrmark.trim();
    }
}