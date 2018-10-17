package com.supply.supplymanage.entity;

public class Order_tail {
    private Integer tailid;

    private Integer chid;

    private Integer odgid;

    private Integer othid;

    private Integer shid;

    private String tailxiang;

    private String tailimg;

    private String tailyan;

    private String tailcai;

    private String tailchan;

    private String tailhua;

    private String tailta;

    public Integer getTailid() {
        return tailid;
    }

    public void setTailid(Integer tailid) {
        this.tailid = tailid;
    }

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public Integer getOdgid() {
        return odgid;
    }

    public void setOdgid(Integer odgid) {
        this.odgid = odgid;
    }

    public Integer getOthid() {
        return othid;
    }

    public void setOthid(Integer othid) {
        this.othid = othid;
    }

    public Integer getShid() {
        return shid;
    }

    public void setShid(Integer shid) {
        this.shid = shid;
    }

    public String getTailxiang() {
        return tailxiang;
    }

    public void setTailxiang(String tailxiang) {
        this.tailxiang = tailxiang == null ? null : tailxiang.trim();
    }

    public String getTailimg() {
        return tailimg;
    }

    public void setTailimg(String tailimg) {
        this.tailimg = tailimg == null ? null : tailimg.trim();
    }

    public String getTailyan() {
        return tailyan;
    }

    public void setTailyan(String tailyan) {
        this.tailyan = tailyan == null ? null : tailyan.trim();
    }

    public String getTailcai() {
        return tailcai;
    }

    public void setTailcai(String tailcai) {
        this.tailcai = tailcai == null ? null : tailcai.trim();
    }

    public String getTailchan() {
        return tailchan;
    }

    public void setTailchan(String tailchan) {
        this.tailchan = tailchan == null ? null : tailchan.trim();
    }

    public String getTailhua() {
        return tailhua;
    }

    public void setTailhua(String tailhua) {
        this.tailhua = tailhua == null ? null : tailhua.trim();
    }

    public String getTailta() {
        return tailta;
    }

    public void setTailta(String tailta) {
        this.tailta = tailta == null ? null : tailta.trim();
    }
}