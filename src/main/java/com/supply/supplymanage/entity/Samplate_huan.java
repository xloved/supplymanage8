package com.supply.supplymanage.entity;

import java.util.Date;

public class Samplate_huan {
    private Integer samhuanid;

    private String samhuancode;

    private String samhuanyuan;

    private Date samhuandate;

    private String samhuangui;

    private String samhuanwei;

    private Long samhuanum;

    private Double samhuanmoney;

    private Double samhuanallmoney;

    private String samhuanstate;

    private Integer samcid;

    private Integer usersid;

    private Integer sizeid;

    private Integer tinctid;

    private Integer seaid;

    private Integer clid;

    public Integer getSamhuanid() {
        return samhuanid;
    }

    public void setSamhuanid(Integer samhuanid) {
        this.samhuanid = samhuanid;
    }

    public String getSamhuancode() {
        return samhuancode;
    }

    public void setSamhuancode(String samhuancode) {
        this.samhuancode = samhuancode == null ? null : samhuancode.trim();
    }

    public String getSamhuanyuan() {
        return samhuanyuan;
    }

    public void setSamhuanyuan(String samhuanyuan) {
        this.samhuanyuan = samhuanyuan == null ? null : samhuanyuan.trim();
    }

    public Date getSamhuandate() {
        return samhuandate;
    }

    public void setSamhuandate(Date samhuandate) {
        this.samhuandate = samhuandate;
    }

    public String getSamhuangui() {
        return samhuangui;
    }

    public void setSamhuangui(String samhuangui) {
        this.samhuangui = samhuangui == null ? null : samhuangui.trim();
    }

    public String getSamhuanwei() {
        return samhuanwei;
    }

    public void setSamhuanwei(String samhuanwei) {
        this.samhuanwei = samhuanwei == null ? null : samhuanwei.trim();
    }

    public Long getSamhuanum() {
        return samhuanum;
    }

    public void setSamhuanum(Long samhuanum) {
        this.samhuanum = samhuanum;
    }

    public Double getSamhuanmoney() {
        return samhuanmoney;
    }

    public void setSamhuanmoney(Double samhuanmoney) {
        this.samhuanmoney = samhuanmoney;
    }

    public Double getSamhuanallmoney() {
        return samhuanallmoney;
    }

    public void setSamhuanallmoney(Double samhuanallmoney) {
        this.samhuanallmoney = samhuanallmoney;
    }

    public String getSamhuanstate() {
        return samhuanstate;
    }

    public void setSamhuanstate(String samhuanstate) {
        this.samhuanstate = samhuanstate == null ? null : samhuanstate.trim();
    }

    public Integer getSamcid() {
        return samcid;
    }

    public void setSamcid(Integer samcid) {
        this.samcid = samcid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
    }

    public Integer getTinctid() {
        return tinctid;
    }

    public void setTinctid(Integer tinctid) {
        this.tinctid = tinctid;
    }

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }
}