package com.supply.supplymanage.entity;

public class Client_type {
    private Integer cltypeid;

    private String cltypename;

    private String remark;

    public Integer getCltypeid() {
        return cltypeid;
    }

    public void setCltypeid(Integer cltypeid) {
        this.cltypeid = cltypeid;
    }

    public String getCltypename() {
        return cltypename;
    }

    public void setCltypename(String cltypename) {
        this.cltypename = cltypename == null ? null : cltypename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}