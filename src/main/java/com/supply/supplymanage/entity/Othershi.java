package com.supply.supplymanage.entity;

import java.util.Date;

public class Othershi {
    private Integer othid;

    private Integer usersid;

    private String othda;

    private String othbuss;

    private Date othhuadate;

    private Date othwandate;

    private String othhaubuss;

    public Integer getOthid() {
        return othid;
    }

    public void setOthid(Integer othid) {
        this.othid = othid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public String getOthda() {
        return othda;
    }

    public void setOthda(String othda) {
        this.othda = othda == null ? null : othda.trim();
    }

    public String getOthbuss() {
        return othbuss;
    }

    public void setOthbuss(String othbuss) {
        this.othbuss = othbuss == null ? null : othbuss.trim();
    }

    public Date getOthhuadate() {
        return othhuadate;
    }

    public void setOthhuadate(Date othhuadate) {
        this.othhuadate = othhuadate;
    }

    public Date getOthwandate() {
        return othwandate;
    }

    public void setOthwandate(Date othwandate) {
        this.othwandate = othwandate;
    }

    public String getOthhaubuss() {
        return othhaubuss;
    }

    public void setOthhaubuss(String othhaubuss) {
        this.othhaubuss = othhaubuss == null ? null : othhaubuss.trim();
    }
}