package com.supply.supplymanage.entity;

public class Sizes {
    private Integer sizeid;

    private String sizename;

    private String sizermark;

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
    }

    public String getSizename() {
        return sizename;
    }

    public void setSizename(String sizename) {
        this.sizename = sizename == null ? null : sizename.trim();
    }

    public String getSizermark() {
        return sizermark;
    }

    public void setSizermark(String sizermark) {
        this.sizermark = sizermark == null ? null : sizermark.trim();
    }
}