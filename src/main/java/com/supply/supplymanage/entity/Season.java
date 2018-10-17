package com.supply.supplymanage.entity;

public class Season {
    private Integer seaid;

    private String seaname;

    private String searmark;

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
    }

    public String getSeaname() {
        return seaname;
    }

    public void setSeaname(String seaname) {
        this.seaname = seaname == null ? null : seaname.trim();
    }

    public String getSearmark() {
        return searmark;
    }

    public void setSearmark(String searmark) {
        this.searmark = searmark == null ? null : searmark.trim();
    }
}