package com.supply.supplymanage.entity;

import java.util.Date;

public class Orders {
    private Integer orderid;

    private Integer brandid;

    private Integer clid;

    private Integer seaid;

    private Integer usersid;

    private Integer eorid;

    private Integer odinfoid;

    private Integer tailid;

    private String ordercode;

    private String custname;

    private Long ordernum;

    private String ordcode;

    private String custcode;

    private Date orderdate;

    private Date orstatedate;

    private String ordstate;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public Integer getEorid() {
        return eorid;
    }

    public void setEorid(Integer eorid) {
        this.eorid = eorid;
    }

    public Integer getOdinfoid() {
        return odinfoid;
    }

    public void setOdinfoid(Integer odinfoid) {
        this.odinfoid = odinfoid;
    }

    public Integer getTailid() {
        return tailid;
    }

    public void setTailid(Integer tailid) {
        this.tailid = tailid;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    public Long getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Long ordernum) {
        this.ordernum = ordernum;
    }

    public String getOrdcode() {
        return ordcode;
    }

    public void setOrdcode(String ordcode) {
        this.ordcode = ordcode == null ? null : ordcode.trim();
    }

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode == null ? null : custcode.trim();
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getOrstatedate() {
        return orstatedate;
    }

    public void setOrstatedate(Date orstatedate) {
        this.orstatedate = orstatedate;
    }

    public String getOrdstate() {
        return ordstate;
    }

    public void setOrdstate(String ordstate) {
        this.ordstate = ordstate == null ? null : ordstate.trim();
    }
}