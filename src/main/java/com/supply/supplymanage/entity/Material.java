package com.supply.supplymanage.entity;

public class Material {
    private Integer mateid;

    private Integer supid;

    private Integer tinctid;

    private Integer ingreid;

    private String matcode;

    private String matename;

    private String sciencode;

    private String norms;

    private String matese;

    private String matewei;

    private Long matemoney;

    private String matermark;

    private String matestate;

    public Integer getMateid() {
        return mateid;
    }

    public void setMateid(Integer mateid) {
        this.mateid = mateid;
    }

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
    }

    public Integer getTinctid() {
        return tinctid;
    }

    public void setTinctid(Integer tinctid) {
        this.tinctid = tinctid;
    }

    public Integer getIngreid() {
        return ingreid;
    }

    public void setIngreid(Integer ingreid) {
        this.ingreid = ingreid;
    }

    public String getMatcode() {
        return matcode;
    }

    public void setMatcode(String matcode) {
        this.matcode = matcode == null ? null : matcode.trim();
    }

    public String getMatename() {
        return matename;
    }

    public void setMatename(String matename) {
        this.matename = matename == null ? null : matename.trim();
    }

    public String getSciencode() {
        return sciencode;
    }

    public void setSciencode(String sciencode) {
        this.sciencode = sciencode == null ? null : sciencode.trim();
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms == null ? null : norms.trim();
    }

    public String getMatese() {
        return matese;
    }

    public void setMatese(String matese) {
        this.matese = matese == null ? null : matese.trim();
    }

    public String getMatewei() {
        return matewei;
    }

    public void setMatewei(String matewei) {
        this.matewei = matewei == null ? null : matewei.trim();
    }

    public Long getMatemoney() {
        return matemoney;
    }

    public void setMatemoney(Long matemoney) {
        this.matemoney = matemoney;
    }

    public String getMatermark() {
        return matermark;
    }

    public void setMatermark(String matermark) {
        this.matermark = matermark == null ? null : matermark.trim();
    }

    public String getMatestate() {
        return matestate;
    }

    public void setMatestate(String matestate) {
        this.matestate = matestate == null ? null : matestate.trim();
    }
}