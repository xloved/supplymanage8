package com.supply.supplymanage.entity;

import java.util.Date;

public class Caihua {
    private Integer chid;

    private Integer usersid;

    private Date chbengindate;

    private Date chfinghdate;

    private Date chdate;

    private String chrmark;

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public Date getChbengindate() {
        return chbengindate;
    }

    public void setChbengindate(Date chbengindate) {
        this.chbengindate = chbengindate;
    }

    public Date getChfinghdate() {
        return chfinghdate;
    }

    public void setChfinghdate(Date chfinghdate) {
        this.chfinghdate = chfinghdate;
    }

    public Date getChdate() {
        return chdate;
    }

    public void setChdate(Date chdate) {
        this.chdate = chdate;
    }

    public String getChrmark() {
        return chrmark;
    }

    public void setChrmark(String chrmark) {
        this.chrmark = chrmark == null ? null : chrmark.trim();
    }
}