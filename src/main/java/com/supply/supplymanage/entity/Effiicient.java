package com.supply.supplymanage.entity;

public class Effiicient {
    private Integer effid;

    private Integer designid;

    private Integer haoid;

    private String effcode;

    private String effname;

    private String effxiao;

    private Long effnum;

    private String effxue;

    private String effshang;

    public Integer getEffid() {
        return effid;
    }

    public void setEffid(Integer effid) {
        this.effid = effid;
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

    public String getEffcode() {
        return effcode;
    }

    public void setEffcode(String effcode) {
        this.effcode = effcode == null ? null : effcode.trim();
    }

    public String getEffname() {
        return effname;
    }

    public void setEffname(String effname) {
        this.effname = effname == null ? null : effname.trim();
    }

    public String getEffxiao() {
        return effxiao;
    }

    public void setEffxiao(String effxiao) {
        this.effxiao = effxiao == null ? null : effxiao.trim();
    }

    public Long getEffnum() {
        return effnum;
    }

    public void setEffnum(Long effnum) {
        this.effnum = effnum;
    }

    public String getEffxue() {
        return effxue;
    }

    public void setEffxue(String effxue) {
        this.effxue = effxue == null ? null : effxue.trim();
    }

    public String getEffshang() {
        return effshang;
    }

    public void setEffshang(String effshang) {
        this.effshang = effshang == null ? null : effshang.trim();
    }
}