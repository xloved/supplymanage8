package com.supply.supplymanage.entity;

import java.util.Date;

public class Buyer {
    private Integer buyerid;

    private Integer purid;

    private Integer supid;

    private Integer supinfoid;

    private Integer tinctid;

    private Integer repid;

    private Integer buycode;

    private Date buydate;

    private Long buyallnum;

    private String buystate;

    private String buygui;

    private Long buynum;

    private Double buymoney;

    private String buystates;

    private String buywei;

    private Long buycainum;

    private Double buyallmoney;

    private String buygoustate;

    public Integer getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
    }

    public Integer getPurid() {
        return purid;
    }

    public void setPurid(Integer purid) {
        this.purid = purid;
    }

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
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

    public Integer getRepid() {
        return repid;
    }

    public void setRepid(Integer repid) {
        this.repid = repid;
    }

    public Integer getBuycode() {
        return buycode;
    }

    public void setBuycode(Integer buycode) {
        this.buycode = buycode;
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public Long getBuyallnum() {
        return buyallnum;
    }

    public void setBuyallnum(Long buyallnum) {
        this.buyallnum = buyallnum;
    }

    public String getBuystate() {
        return buystate;
    }

    public void setBuystate(String buystate) {
        this.buystate = buystate == null ? null : buystate.trim();
    }

    public String getBuygui() {
        return buygui;
    }

    public void setBuygui(String buygui) {
        this.buygui = buygui == null ? null : buygui.trim();
    }

    public Long getBuynum() {
        return buynum;
    }

    public void setBuynum(Long buynum) {
        this.buynum = buynum;
    }

    public Double getBuymoney() {
        return buymoney;
    }

    public void setBuymoney(Double buymoney) {
        this.buymoney = buymoney;
    }

    public String getBuystates() {
        return buystates;
    }

    public void setBuystates(String buystates) {
        this.buystates = buystates == null ? null : buystates.trim();
    }

    public String getBuywei() {
        return buywei;
    }

    public void setBuywei(String buywei) {
        this.buywei = buywei == null ? null : buywei.trim();
    }

    public Long getBuycainum() {
        return buycainum;
    }

    public void setBuycainum(Long buycainum) {
        this.buycainum = buycainum;
    }

    public Double getBuyallmoney() {
        return buyallmoney;
    }

    public void setBuyallmoney(Double buyallmoney) {
        this.buyallmoney = buyallmoney;
    }

    public String getBuygoustate() {
        return buygoustate;
    }

    public void setBuygoustate(String buygoustate) {
        this.buygoustate = buygoustate == null ? null : buygoustate.trim();
    }
}