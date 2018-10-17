package com.supply.supplymanage.entity;

public class Client {
    private Integer clid;

    private Integer cltypeid;

    private String clname;

    private String clshort;

    private String clstate;

    private String remark;

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getCltypeid() {
        return cltypeid;
    }

    public void setCltypeid(Integer cltypeid) {
        this.cltypeid = cltypeid;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname == null ? null : clname.trim();
    }

    public String getClshort() {
        return clshort;
    }

    public void setClshort(String clshort) {
        this.clshort = clshort == null ? null : clshort.trim();
    }

    public String getClstate() {
        return clstate;
    }

    public void setClstate(String clstate) {
        this.clstate = clstate == null ? null : clstate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}