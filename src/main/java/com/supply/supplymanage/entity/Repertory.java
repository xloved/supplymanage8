package com.supply.supplymanage.entity;

public class Repertory {
    private Integer repid;

    private String repkuan;

    private String reptype;

    private String repcode;

    private String repcihao;

    private String repwucode;

    private String repwuname;

    private String rephui;

    private String repyan;

    private String repse;

    private String repwei;

    private Long repnum;

    private Double repdan;

    private Double repallmoney;

    private Integer frpid;

    private Integer preclid;

    private Integer receid;

    private Integer stockid;

    public Integer getRepid() {
        return repid;
    }

    public void setRepid(Integer repid) {
        this.repid = repid;
    }

    public String getRepkuan() {
        return repkuan;
    }

    public void setRepkuan(String repkuan) {
        this.repkuan = repkuan == null ? null : repkuan.trim();
    }

    public String getReptype() {
        return reptype;
    }

    public void setReptype(String reptype) {
        this.reptype = reptype == null ? null : reptype.trim();
    }

    public String getRepcode() {
        return repcode;
    }

    public void setRepcode(String repcode) {
        this.repcode = repcode == null ? null : repcode.trim();
    }

    public String getRepcihao() {
        return repcihao;
    }

    public void setRepcihao(String repcihao) {
        this.repcihao = repcihao == null ? null : repcihao.trim();
    }

    public String getRepwucode() {
        return repwucode;
    }

    public void setRepwucode(String repwucode) {
        this.repwucode = repwucode == null ? null : repwucode.trim();
    }

    public String getRepwuname() {
        return repwuname;
    }

    public void setRepwuname(String repwuname) {
        this.repwuname = repwuname == null ? null : repwuname.trim();
    }

    public String getRephui() {
        return rephui;
    }

    public void setRephui(String rephui) {
        this.rephui = rephui == null ? null : rephui.trim();
    }

    public String getRepyan() {
        return repyan;
    }

    public void setRepyan(String repyan) {
        this.repyan = repyan == null ? null : repyan.trim();
    }

    public String getRepse() {
        return repse;
    }

    public void setRepse(String repse) {
        this.repse = repse == null ? null : repse.trim();
    }

    public String getRepwei() {
        return repwei;
    }

    public void setRepwei(String repwei) {
        this.repwei = repwei == null ? null : repwei.trim();
    }

    public Long getRepnum() {
        return repnum;
    }

    public void setRepnum(Long repnum) {
        this.repnum = repnum;
    }

    public Double getRepdan() {
        return repdan;
    }

    public void setRepdan(Double repdan) {
        this.repdan = repdan;
    }

    public Double getRepallmoney() {
        return repallmoney;
    }

    public void setRepallmoney(Double repallmoney) {
        this.repallmoney = repallmoney;
    }

    public Integer getFrpid() {
        return frpid;
    }

    public void setFrpid(Integer frpid) {
        this.frpid = frpid;
    }

    public Integer getPreclid() {
        return preclid;
    }

    public void setPreclid(Integer preclid) {
        this.preclid = preclid;
    }

    public Integer getReceid() {
        return receid;
    }

    public void setReceid(Integer receid) {
        this.receid = receid;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }
}