package com.supply.supplymanage.entity;

import java.util.Date;

public class Product_ban {
    private Integer probanid;

    private Integer deteid;

    private String proban;

    private String probank;

    private String probhuor;

    private Date probtime;

    private Long probnum;

    private Long probjinum;

    private Long probnonum;

    private Long probwnum;

    private Long probsnum;

    private String problv;

    private String prono;

    public Integer getProbanid() {
        return probanid;
    }

    public void setProbanid(Integer probanid) {
        this.probanid = probanid;
    }

    public Integer getDeteid() {
        return deteid;
    }

    public void setDeteid(Integer deteid) {
        this.deteid = deteid;
    }

    public String getProban() {
        return proban;
    }

    public void setProban(String proban) {
        this.proban = proban == null ? null : proban.trim();
    }

    public String getProbank() {
        return probank;
    }

    public void setProbank(String probank) {
        this.probank = probank == null ? null : probank.trim();
    }

    public String getProbhuor() {
        return probhuor;
    }

    public void setProbhuor(String probhuor) {
        this.probhuor = probhuor == null ? null : probhuor.trim();
    }

    public Date getProbtime() {
        return probtime;
    }

    public void setProbtime(Date probtime) {
        this.probtime = probtime;
    }

    public Long getProbnum() {
        return probnum;
    }

    public void setProbnum(Long probnum) {
        this.probnum = probnum;
    }

    public Long getProbjinum() {
        return probjinum;
    }

    public void setProbjinum(Long probjinum) {
        this.probjinum = probjinum;
    }

    public Long getProbnonum() {
        return probnonum;
    }

    public void setProbnonum(Long probnonum) {
        this.probnonum = probnonum;
    }

    public Long getProbwnum() {
        return probwnum;
    }

    public void setProbwnum(Long probwnum) {
        this.probwnum = probwnum;
    }

    public Long getProbsnum() {
        return probsnum;
    }

    public void setProbsnum(Long probsnum) {
        this.probsnum = probsnum;
    }

    public String getProblv() {
        return problv;
    }

    public void setProblv(String problv) {
        this.problv = problv == null ? null : problv.trim();
    }

    public String getProno() {
        return prono;
    }

    public void setProno(String prono) {
        this.prono = prono == null ? null : prono.trim();
    }
}