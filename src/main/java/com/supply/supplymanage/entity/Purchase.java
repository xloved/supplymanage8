package com.supply.supplymanage.entity;

import java.util.Date;

public class Purchase {
    private Integer purid;

    private Integer supinfoid;

    private Integer brandid;

    private Integer tinctid;

    private Integer haoid;

    private Integer designid;

    private Integer supid;

    private Integer seaid;

    private Date purdate;

    private Date purdates;

    private String purcode;

    private String purecode;

    private String purchang;

    private String puryong;

    private String purhuo;

    private String purchgui;

    private String purchstate;

    private String purmark;

    public Integer getPurid() {
        return purid;
    }

    public void setPurid(Integer purid) {
        this.purid = purid;
    }

    public Integer getSupinfoid() {
        return supinfoid;
    }

    public void setSupinfoid(Integer supinfoid) {
        this.supinfoid = supinfoid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
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

    public Integer getDesignid() {
        return designid;
    }

    public void setDesignid(Integer designid) {
        this.designid = designid;
    }

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
    }

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
    }

    public Date getPurdate() {
        return purdate;
    }

    public void setPurdate(Date purdate) {
        this.purdate = purdate;
    }

    public Date getPurdates() {
        return purdates;
    }

    public void setPurdates(Date purdates) {
        this.purdates = purdates;
    }

    public String getPurcode() {
        return purcode;
    }

    public void setPurcode(String purcode) {
        this.purcode = purcode == null ? null : purcode.trim();
    }

    public String getPurecode() {
        return purecode;
    }

    public void setPurecode(String purecode) {
        this.purecode = purecode == null ? null : purecode.trim();
    }

    public String getPurchang() {
        return purchang;
    }

    public void setPurchang(String purchang) {
        this.purchang = purchang == null ? null : purchang.trim();
    }

    public String getPuryong() {
        return puryong;
    }

    public void setPuryong(String puryong) {
        this.puryong = puryong == null ? null : puryong.trim();
    }

    public String getPurhuo() {
        return purhuo;
    }

    public void setPurhuo(String purhuo) {
        this.purhuo = purhuo == null ? null : purhuo.trim();
    }

    public String getPurchgui() {
        return purchgui;
    }

    public void setPurchgui(String purchgui) {
        this.purchgui = purchgui == null ? null : purchgui.trim();
    }

    public String getPurchstate() {
        return purchstate;
    }

    public void setPurchstate(String purchstate) {
        this.purchstate = purchstate == null ? null : purchstate.trim();
    }

    public String getPurmark() {
        return purmark;
    }

    public void setPurmark(String purmark) {
        this.purmark = purmark == null ? null : purmark.trim();
    }
}