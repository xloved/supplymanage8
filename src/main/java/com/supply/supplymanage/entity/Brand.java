package com.supply.supplymanage.entity;

public class Brand {
    private Integer brandid;

    private String brandcod;

    private String brandname;

    private String brandquan;

    private Long brandbei;

    private String rmark;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandcod() {
        return brandcod;
    }

    public void setBrandcod(String brandcod) {
        this.brandcod = brandcod == null ? null : brandcod.trim();
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getBrandquan() {
        return brandquan;
    }

    public void setBrandquan(String brandquan) {
        this.brandquan = brandquan == null ? null : brandquan.trim();
    }

    public Long getBrandbei() {
        return brandbei;
    }

    public void setBrandbei(Long brandbei) {
        this.brandbei = brandbei;
    }

    public String getRmark() {
        return rmark;
    }

    public void setRmark(String rmark) {
        this.rmark = rmark == null ? null : rmark.trim();
    }
}