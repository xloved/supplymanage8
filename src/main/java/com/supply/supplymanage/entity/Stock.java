package com.supply.supplymanage.entity;

public class Stock {
    private Integer stockid;

    private String stocktype;

    private String stockcode;

    private Long stockallnum;

    private Long stocknum;

    private Long stockshenum;

    private Long stockkunum;

    private String stocktyped;

    private Long stockgong;

    private Long stockcainum;

    private String stockwei;

    private String stockming;

    private String stockstate;

    private Integer storid;

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public String getStocktype() {
        return stocktype;
    }

    public void setStocktype(String stocktype) {
        this.stocktype = stocktype == null ? null : stocktype.trim();
    }

    public String getStockcode() {
        return stockcode;
    }

    public void setStockcode(String stockcode) {
        this.stockcode = stockcode == null ? null : stockcode.trim();
    }

    public Long getStockallnum() {
        return stockallnum;
    }

    public void setStockallnum(Long stockallnum) {
        this.stockallnum = stockallnum;
    }

    public Long getStocknum() {
        return stocknum;
    }

    public void setStocknum(Long stocknum) {
        this.stocknum = stocknum;
    }

    public Long getStockshenum() {
        return stockshenum;
    }

    public void setStockshenum(Long stockshenum) {
        this.stockshenum = stockshenum;
    }

    public Long getStockkunum() {
        return stockkunum;
    }

    public void setStockkunum(Long stockkunum) {
        this.stockkunum = stockkunum;
    }

    public String getStocktyped() {
        return stocktyped;
    }

    public void setStocktyped(String stocktyped) {
        this.stocktyped = stocktyped == null ? null : stocktyped.trim();
    }

    public Long getStockgong() {
        return stockgong;
    }

    public void setStockgong(Long stockgong) {
        this.stockgong = stockgong;
    }

    public Long getStockcainum() {
        return stockcainum;
    }

    public void setStockcainum(Long stockcainum) {
        this.stockcainum = stockcainum;
    }

    public String getStockwei() {
        return stockwei;
    }

    public void setStockwei(String stockwei) {
        this.stockwei = stockwei == null ? null : stockwei.trim();
    }

    public String getStockming() {
        return stockming;
    }

    public void setStockming(String stockming) {
        this.stockming = stockming == null ? null : stockming.trim();
    }

    public String getStockstate() {
        return stockstate;
    }

    public void setStockstate(String stockstate) {
        this.stockstate = stockstate == null ? null : stockstate.trim();
    }

    public Integer getStorid() {
        return storid;
    }

    public void setStorid(Integer storid) {
        this.storid = storid;
    }
}