package com.supply.supplymanage.entity;

public class Suppliesinfo {
    private Integer supinfoid;

    private Integer sdinfoid;

    private Integer supid;

    private Integer mateid;

    private String supcode;

    private String supinfoname;

    private String supmodels;

    private String supstate;

    private String supstues;

    private String supinformark;

    public Integer getSupinfoid() {
        return supinfoid;
    }

    public void setSupinfoid(Integer supinfoid) {
        this.supinfoid = supinfoid;
    }

    public Integer getSdinfoid() {
        return sdinfoid;
    }

    public void setSdinfoid(Integer sdinfoid) {
        this.sdinfoid = sdinfoid;
    }

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
    }

    public Integer getMateid() {
        return mateid;
    }

    public void setMateid(Integer mateid) {
        this.mateid = mateid;
    }

    public String getSupcode() {
        return supcode;
    }

    public void setSupcode(String supcode) {
        this.supcode = supcode == null ? null : supcode.trim();
    }

    public String getSupinfoname() {
        return supinfoname;
    }

    public void setSupinfoname(String supinfoname) {
        this.supinfoname = supinfoname == null ? null : supinfoname.trim();
    }

    public String getSupmodels() {
        return supmodels;
    }

    public void setSupmodels(String supmodels) {
        this.supmodels = supmodels == null ? null : supmodels.trim();
    }

    public String getSupstate() {
        return supstate;
    }

    public void setSupstate(String supstate) {
        this.supstate = supstate == null ? null : supstate.trim();
    }

    public String getSupstues() {
        return supstues;
    }

    public void setSupstues(String supstues) {
        this.supstues = supstues == null ? null : supstues.trim();
    }

    public String getSupinformark() {
        return supinformark;
    }

    public void setSupinformark(String supinformark) {
        this.supinformark = supinformark == null ? null : supinformark.trim();
    }
}