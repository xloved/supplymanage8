package com.supply.supplymanage.entity;

public class Plate {
    private Integer plaid;

    private String planame;

    private String plarmark;

    public Integer getPlaid() {
        return plaid;
    }

    public void setPlaid(Integer plaid) {
        this.plaid = plaid;
    }

    public String getPlaname() {
        return planame;
    }

    public void setPlaname(String planame) {
        this.planame = planame == null ? null : planame.trim();
    }

    public String getPlarmark() {
        return plarmark;
    }

    public void setPlarmark(String plarmark) {
        this.plarmark = plarmark == null ? null : plarmark.trim();
    }
}