package com.supply.supplymanage.entity;

public class Supplier {
    private Integer supid;

    private Integer sutypeid;

    private String supcode;

    private String supname;

    private String supstate;

    private String rmark;

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
    }

    public Integer getSutypeid() {
        return sutypeid;
    }

    public void setSutypeid(Integer sutypeid) {
        this.sutypeid = sutypeid;
    }

    public String getSupcode() {
        return supcode;
    }

    public void setSupcode(String supcode) {
        this.supcode = supcode == null ? null : supcode.trim();
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname == null ? null : supname.trim();
    }

    public String getSupstate() {
        return supstate;
    }

    public void setSupstate(String supstate) {
        this.supstate = supstate == null ? null : supstate.trim();
    }

    public String getRmark() {
        return rmark;
    }

    public void setRmark(String rmark) {
        this.rmark = rmark == null ? null : rmark.trim();
    }
}