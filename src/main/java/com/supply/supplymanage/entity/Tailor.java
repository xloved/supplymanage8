package com.supply.supplymanage.entity;

import java.util.Date;

public class Tailor {
    private Integer tailorid;

    private Integer sizeid;

    private Integer clid;

    private Integer designid;

    private Integer haoid;

    private String tailstate;

    private String tailcode;

    private Long tailorallnum;

    private Long tailorsuonum;

    private Long tailorcainum;

    private Long taiklorweinum;

    private Date tailojiaodate;

    private Long tailorbennum;

    private String pocodes;

    public Integer getTailorid() {
        return tailorid;
    }

    public void setTailorid(Integer tailorid) {
        this.tailorid = tailorid;
    }

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getDesignid() {
        return designid;
    }

    public void setDesignid(Integer designid) {
        this.designid = designid;
    }

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public String getTailstate() {
        return tailstate;
    }

    public void setTailstate(String tailstate) {
        this.tailstate = tailstate == null ? null : tailstate.trim();
    }

    public String getTailcode() {
        return tailcode;
    }

    public void setTailcode(String tailcode) {
        this.tailcode = tailcode == null ? null : tailcode.trim();
    }

    public Long getTailorallnum() {
        return tailorallnum;
    }

    public void setTailorallnum(Long tailorallnum) {
        this.tailorallnum = tailorallnum;
    }

    public Long getTailorsuonum() {
        return tailorsuonum;
    }

    public void setTailorsuonum(Long tailorsuonum) {
        this.tailorsuonum = tailorsuonum;
    }

    public Long getTailorcainum() {
        return tailorcainum;
    }

    public void setTailorcainum(Long tailorcainum) {
        this.tailorcainum = tailorcainum;
    }

    public Long getTaiklorweinum() {
        return taiklorweinum;
    }

    public void setTaiklorweinum(Long taiklorweinum) {
        this.taiklorweinum = taiklorweinum;
    }

    public Date getTailojiaodate() {
        return tailojiaodate;
    }

    public void setTailojiaodate(Date tailojiaodate) {
        this.tailojiaodate = tailojiaodate;
    }

    public Long getTailorbennum() {
        return tailorbennum;
    }

    public void setTailorbennum(Long tailorbennum) {
        this.tailorbennum = tailorbennum;
    }

    public String getPocodes() {
        return pocodes;
    }

    public void setPocodes(String pocodes) {
        this.pocodes = pocodes == null ? null : pocodes.trim();
    }
}