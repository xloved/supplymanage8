package com.supply.supplymanage.entity;

public class Tinct_type {
    private Integer tintypeid;

    private String tintypename;

    private String tinrmark;

    public Integer getTintypeid() {
        return tintypeid;
    }

    public void setTintypeid(Integer tintypeid) {
        this.tintypeid = tintypeid;
    }

    public String getTintypename() {
        return tintypename;
    }

    public void setTintypename(String tintypename) {
        this.tintypename = tintypename == null ? null : tintypename.trim();
    }

    public String getTinrmark() {
        return tinrmark;
    }

    public void setTinrmark(String tinrmark) {
        this.tinrmark = tinrmark == null ? null : tinrmark.trim();
    }
}