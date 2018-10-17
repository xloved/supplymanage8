package com.supply.supplymanage.entity;

import java.util.Date;

public class Default_timer {
    private Integer detimeid;

    private String detimename;

    private Date detime;

    public Integer getDetimeid() {
        return detimeid;
    }

    public void setDetimeid(Integer detimeid) {
        this.detimeid = detimeid;
    }

    public String getDetimename() {
        return detimename;
    }

    public void setDetimename(String detimename) {
        this.detimename = detimename == null ? null : detimename.trim();
    }

    public Date getDetime() {
        return detime;
    }

    public void setDetime(Date detime) {
        this.detime = detime;
    }
}