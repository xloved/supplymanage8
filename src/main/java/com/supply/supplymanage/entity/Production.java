package com.supply.supplymanage.entity;

public class Production {
    private Integer proid;

    private Integer brandid;

    private Integer seaid;

    private Integer haoid;

    private Integer designid;

    private Integer clid;

    private String procode;

    private Long pronum;

    private Long prochunum;

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
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

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public Integer getDesignid() {
        return designid;
    }

    public void setDesignid(Integer designid) {
        this.designid = designid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getProcode() {
        return procode;
    }

    public void setProcode(String procode) {
        this.procode = procode == null ? null : procode.trim();
    }

    public Long getPronum() {
        return pronum;
    }

    public void setPronum(Long pronum) {
        this.pronum = pronum;
    }

    public Long getProchunum() {
        return prochunum;
    }

    public void setProchunum(Long prochunum) {
        this.prochunum = prochunum;
    }
}