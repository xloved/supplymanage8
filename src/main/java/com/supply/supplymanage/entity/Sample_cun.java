package com.supply.supplymanage.entity;

import java.util.Date;

public class Sample_cun {
    private Integer samcid;

    private Integer samchuid;

    private Integer seaid;

    private Integer designid;

    private Integer plaid;

    private Integer clid;

    private Integer entrid;

    private Date samcdate;

    private String samcode;

    private String samchaocode;

    private String samcrmark;

    private String samcgui;

    private String samcwei;

    private Long samcnum;

    public Integer getSamcid() {
        return samcid;
    }

    public void setSamcid(Integer samcid) {
        this.samcid = samcid;
    }

    public Integer getSamchuid() {
        return samchuid;
    }

    public void setSamchuid(Integer samchuid) {
        this.samchuid = samchuid;
    }

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
    }

    public Integer getDesignid() {
        return designid;
    }

    public void setDesignid(Integer designid) {
        this.designid = designid;
    }

    public Integer getPlaid() {
        return plaid;
    }

    public void setPlaid(Integer plaid) {
        this.plaid = plaid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getEntrid() {
        return entrid;
    }

    public void setEntrid(Integer entrid) {
        this.entrid = entrid;
    }

    public Date getSamcdate() {
        return samcdate;
    }

    public void setSamcdate(Date samcdate) {
        this.samcdate = samcdate;
    }

    public String getSamcode() {
        return samcode;
    }

    public void setSamcode(String samcode) {
        this.samcode = samcode == null ? null : samcode.trim();
    }

    public String getSamchaocode() {
        return samchaocode;
    }

    public void setSamchaocode(String samchaocode) {
        this.samchaocode = samchaocode == null ? null : samchaocode.trim();
    }

    public String getSamcrmark() {
        return samcrmark;
    }

    public void setSamcrmark(String samcrmark) {
        this.samcrmark = samcrmark == null ? null : samcrmark.trim();
    }

    public String getSamcgui() {
        return samcgui;
    }

    public void setSamcgui(String samcgui) {
        this.samcgui = samcgui == null ? null : samcgui.trim();
    }

    public String getSamcwei() {
        return samcwei;
    }

    public void setSamcwei(String samcwei) {
        this.samcwei = samcwei == null ? null : samcwei.trim();
    }

    public Long getSamcnum() {
        return samcnum;
    }

    public void setSamcnum(Long samcnum) {
        this.samcnum = samcnum;
    }
}