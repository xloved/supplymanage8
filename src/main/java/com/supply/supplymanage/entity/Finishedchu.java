package com.supply.supplymanage.entity;

import java.util.Date;

public class Finishedchu {
    private Integer fcid;

    private Integer usersid;

    private Integer entrid;

    private String fccode;

    private Date fcdate;

    private String fcsend;

    private String fcuser;

    private String fcway;

    private String fccust;

    private String fcphone;

    private String fcwuliu;

    private Long fcallnum;

    public Integer getFcid() {
        return fcid;
    }

    public void setFcid(Integer fcid) {
        this.fcid = fcid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public Integer getEntrid() {
        return entrid;
    }

    public void setEntrid(Integer entrid) {
        this.entrid = entrid;
    }

    public String getFccode() {
        return fccode;
    }

    public void setFccode(String fccode) {
        this.fccode = fccode == null ? null : fccode.trim();
    }

    public Date getFcdate() {
        return fcdate;
    }

    public void setFcdate(Date fcdate) {
        this.fcdate = fcdate;
    }

    public String getFcsend() {
        return fcsend;
    }

    public void setFcsend(String fcsend) {
        this.fcsend = fcsend == null ? null : fcsend.trim();
    }

    public String getFcuser() {
        return fcuser;
    }

    public void setFcuser(String fcuser) {
        this.fcuser = fcuser == null ? null : fcuser.trim();
    }

    public String getFcway() {
        return fcway;
    }

    public void setFcway(String fcway) {
        this.fcway = fcway == null ? null : fcway.trim();
    }

    public String getFccust() {
        return fccust;
    }

    public void setFccust(String fccust) {
        this.fccust = fccust == null ? null : fccust.trim();
    }

    public String getFcphone() {
        return fcphone;
    }

    public void setFcphone(String fcphone) {
        this.fcphone = fcphone == null ? null : fcphone.trim();
    }

    public String getFcwuliu() {
        return fcwuliu;
    }

    public void setFcwuliu(String fcwuliu) {
        this.fcwuliu = fcwuliu == null ? null : fcwuliu.trim();
    }

    public Long getFcallnum() {
        return fcallnum;
    }

    public void setFcallnum(Long fcallnum) {
        this.fcallnum = fcallnum;
    }
}