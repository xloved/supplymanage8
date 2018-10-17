package com.supply.supplymanage.entity;

public class Finished_product {
    private Integer fpid;

    private Integer fcid;

    private Integer entrid;

    private Integer brandid;

    private Integer seaid;

    private Integer tinctid;

    private Integer haoid;

    private Integer clid;

    private Integer sizeid;

    private String fpcode;

    private String pocode;

    private String fpaddress;

    private String fpnper;

    private Long fpnum;

    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
    }

    public Integer getFcid() {
        return fcid;
    }

    public void setFcid(Integer fcid) {
        this.fcid = fcid;
    }

    public Integer getEntrid() {
        return entrid;
    }

    public void setEntrid(Integer entrid) {
        this.entrid = entrid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
    }

    public Integer getTinctid() {
        return tinctid;
    }

    public void setTinctid(Integer tinctid) {
        this.tinctid = tinctid;
    }

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
    }

    public String getFpcode() {
        return fpcode;
    }

    public void setFpcode(String fpcode) {
        this.fpcode = fpcode == null ? null : fpcode.trim();
    }

    public String getPocode() {
        return pocode;
    }

    public void setPocode(String pocode) {
        this.pocode = pocode == null ? null : pocode.trim();
    }

    public String getFpaddress() {
        return fpaddress;
    }

    public void setFpaddress(String fpaddress) {
        this.fpaddress = fpaddress == null ? null : fpaddress.trim();
    }

    public String getFpnper() {
        return fpnper;
    }

    public void setFpnper(String fpnper) {
        this.fpnper = fpnper == null ? null : fpnper.trim();
    }

    public Long getFpnum() {
        return fpnum;
    }

    public void setFpnum(Long fpnum) {
        this.fpnum = fpnum;
    }
}