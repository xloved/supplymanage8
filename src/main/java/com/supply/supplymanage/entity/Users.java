package com.supply.supplymanage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Users {
    private Integer usersid;

    private String uname;

    private String upwd;

    private String usersname;

    private String uphone;

    private String usex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ubrith;

    private String ustate;

    private Integer uposition;

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname == null ? null : usersname.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    public Date getUbrith() {
        return ubrith;
    }

    public void setUbrith(Date ubrith) {
        this.ubrith = ubrith;
    }

    public String getUstate() {
        return ustate;
    }

    public void setUstate(String ustate) {
        this.ustate = ustate == null ? null : ustate.trim();
    }

    public Integer getUposition() {
        return uposition;
    }

    public void setUposition(Integer uposition) {
        this.uposition = uposition;
    }
}