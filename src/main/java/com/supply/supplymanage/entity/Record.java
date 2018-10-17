package com.supply.supplymanage.entity;

import java.util.Date;

public class Record {
    private Integer reid;

    private String retype;

    private String recordname;

    private String recordmark;

    private Date redate;

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public String getRetype() {
        return retype;
    }

    public void setRetype(String retype) {
        this.retype = retype == null ? null : retype.trim();
    }

    public String getRecordname() {
        return recordname;
    }

    public void setRecordname(String recordname) {
        this.recordname = recordname == null ? null : recordname.trim();
    }

    public String getRecordmark() {
        return recordmark;
    }

    public void setRecordmark(String recordmark) {
        this.recordmark = recordmark == null ? null : recordmark.trim();
    }

    public Date getRedate() {
        return redate;
    }

    public void setRedate(Date redate) {
        this.redate = redate;
    }
}