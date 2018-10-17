package com.supply.supplymanage.entity;

public class Budgetyu {
    private Integer budid;

    private String budcode;

    private String budban;

    private Double budjia;

    private Double budbao;

    private Double budyu;

    private Long budshui;

    private Double budshuie;

    private Double budfei;

    private String budbilv;

    private Double budmoney;

    public Integer getBudid() {
        return budid;
    }

    public void setBudid(Integer budid) {
        this.budid = budid;
    }

    public String getBudcode() {
        return budcode;
    }

    public void setBudcode(String budcode) {
        this.budcode = budcode == null ? null : budcode.trim();
    }

    public String getBudban() {
        return budban;
    }

    public void setBudban(String budban) {
        this.budban = budban == null ? null : budban.trim();
    }

    public Double getBudjia() {
        return budjia;
    }

    public void setBudjia(Double budjia) {
        this.budjia = budjia;
    }

    public Double getBudbao() {
        return budbao;
    }

    public void setBudbao(Double budbao) {
        this.budbao = budbao;
    }

    public Double getBudyu() {
        return budyu;
    }

    public void setBudyu(Double budyu) {
        this.budyu = budyu;
    }

    public Long getBudshui() {
        return budshui;
    }

    public void setBudshui(Long budshui) {
        this.budshui = budshui;
    }

    public Double getBudshuie() {
        return budshuie;
    }

    public void setBudshuie(Double budshuie) {
        this.budshuie = budshuie;
    }

    public Double getBudfei() {
        return budfei;
    }

    public void setBudfei(Double budfei) {
        this.budfei = budfei;
    }

    public String getBudbilv() {
        return budbilv;
    }

    public void setBudbilv(String budbilv) {
        this.budbilv = budbilv == null ? null : budbilv.trim();
    }

    public Double getBudmoney() {
        return budmoney;
    }

    public void setBudmoney(Double budmoney) {
        this.budmoney = budmoney;
    }
}