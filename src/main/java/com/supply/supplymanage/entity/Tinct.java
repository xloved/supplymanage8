package com.supply.supplymanage.entity;

public class Tinct {
    private Integer tinctid;

    private Integer tintypeid;

    private String tinctname;

    private String tinctcolor;

    private Long tinctzhi;

    private String tinctimg;

    private String tinctcol;

    private String tinctstatue;

    public Integer getTinctid() {
        return tinctid;
    }

    public void setTinctid(Integer tinctid) {
        this.tinctid = tinctid;
    }

    public Integer getTintypeid() {
        return tintypeid;
    }

    public void setTintypeid(Integer tintypeid) {
        this.tintypeid = tintypeid;
    }

    public String getTinctname() {
        return tinctname;
    }

    public void setTinctname(String tinctname) {
        this.tinctname = tinctname == null ? null : tinctname.trim();
    }

    public String getTinctcolor() {
        return tinctcolor;
    }

    public void setTinctcolor(String tinctcolor) {
        this.tinctcolor = tinctcolor == null ? null : tinctcolor.trim();
    }

    public Long getTinctzhi() {
        return tinctzhi;
    }

    public void setTinctzhi(Long tinctzhi) {
        this.tinctzhi = tinctzhi;
    }

    public String getTinctimg() {
        return tinctimg;
    }

    public void setTinctimg(String tinctimg) {
        this.tinctimg = tinctimg == null ? null : tinctimg.trim();
    }

    public String getTinctcol() {
        return tinctcol;
    }

    public void setTinctcol(String tinctcol) {
        this.tinctcol = tinctcol == null ? null : tinctcol.trim();
    }

    public String getTinctstatue() {
        return tinctstatue;
    }

    public void setTinctstatue(String tinctstatue) {
        this.tinctstatue = tinctstatue == null ? null : tinctstatue.trim();
    }
}