package com.supply.supplymanage.entity;

import java.util.Date;

public class Frpru {
    private Integer frpid;

    private Integer entrid;

    private Integer supid;

    private Integer clid;

    private Integer seaid;

    private Integer usersid;

    private Integer supinfoid;

    private Integer tinctid;

    private Integer haoid;

    private Integer styHaoid;

    private Date frpdate;

    private String frpcode;

    private String frprucode;

    private String frpcihao;

    private String frpcgui;

    private String frpwei;

    private Long frpshennum;

    private Long frpallnum;

    private String frpstate;

    public Integer getFrpid() {
        return frpid;
    }

    public void setFrpid(Integer frpid) {
        this.frpid = frpid;
    }

    public Integer getEntrid() {
        return entrid;
    }

    public void setEntrid(Integer entrid) {
        this.entrid = entrid;
    }

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
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

    public Integer getSupinfoid() {
        return supinfoid;
    }

    public void setSupinfoid(Integer supinfoid) {
        this.supinfoid = supinfoid;
    }

    public Integer getTinctid() {
        return tinctid;
    }

    public void setTinctid(Integer tinctid) {
        this.tinctid = tinctid;
    }

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public Integer getStyHaoid() {
        return styHaoid;
    }

    public void setStyHaoid(Integer styHaoid) {
        this.styHaoid = styHaoid;
    }

    public Date getFrpdate() {
        return frpdate;
    }

    public void setFrpdate(Date frpdate) {
        this.frpdate = frpdate;
    }

    public String getFrpcode() {
        return frpcode;
    }

    public void setFrpcode(String frpcode) {
        this.frpcode = frpcode == null ? null : frpcode.trim();
    }

    public String getFrprucode() {
        return frprucode;
    }

    public void setFrprucode(String frprucode) {
        this.frprucode = frprucode == null ? null : frprucode.trim();
    }

    public String getFrpcihao() {
        return frpcihao;
    }

    public void setFrpcihao(String frpcihao) {
        this.frpcihao = frpcihao == null ? null : frpcihao.trim();
    }

    public String getFrpcgui() {
        return frpcgui;
    }

    public void setFrpcgui(String frpcgui) {
        this.frpcgui = frpcgui == null ? null : frpcgui.trim();
    }

    public String getFrpwei() {
        return frpwei;
    }

    public void setFrpwei(String frpwei) {
        this.frpwei = frpwei == null ? null : frpwei.trim();
    }

    public Long getFrpshennum() {
        return frpshennum;
    }

    public void setFrpshennum(Long frpshennum) {
        this.frpshennum = frpshennum;
    }

    public Long getFrpallnum() {
        return frpallnum;
    }

    public void setFrpallnum(Long frpallnum) {
        this.frpallnum = frpallnum;
    }

    public String getFrpstate() {
        return frpstate;
    }

    public void setFrpstate(String frpstate) {
        this.frpstate = frpstate == null ? null : frpstate.trim();
    }
}