package com.supply.supplymanage.entity;

import java.util.Date;

public class Finishedru {
    private Integer fdid;

    private Date fddate;

    private String fdcode;

    private String fdxiaocode;

    private Date fdchudate;

    private Long fdallnum;

    private Integer fpid;

    private Integer entrid;

    private Integer seaid;

    private Integer seaSeaid;

    private Integer clid;

    private Integer haoid;

    public Integer getFdid() {
        return fdid;
    }

    public void setFdid(Integer fdid) {
        this.fdid = fdid;
    }

    public Date getFddate() {
        return fddate;
    }

    public void setFddate(Date fddate) {
        this.fddate = fddate;
    }

    public String getFdcode() {
        return fdcode;
    }

    public void setFdcode(String fdcode) {
        this.fdcode = fdcode == null ? null : fdcode.trim();
    }

    public String getFdxiaocode() {
        return fdxiaocode;
    }

    public void setFdxiaocode(String fdxiaocode) {
        this.fdxiaocode = fdxiaocode == null ? null : fdxiaocode.trim();
    }

    public Date getFdchudate() {
        return fdchudate;
    }

    public void setFdchudate(Date fdchudate) {
        this.fdchudate = fdchudate;
    }

    public Long getFdallnum() {
        return fdallnum;
    }

    public void setFdallnum(Long fdallnum) {
        this.fdallnum = fdallnum;
    }

    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
    }

    public Integer getEntrid() {
        return entrid;
    }

    public void setEntrid(Integer entrid) {
        this.entrid = entrid;
    }

    public Integer getSeaid() {
        return seaid;
    }

    public void setSeaid(Integer seaid) {
        this.seaid = seaid;
    }

    public Integer getSeaSeaid() {
        return seaSeaid;
    }

    public void setSeaSeaid(Integer seaSeaid) {
        this.seaSeaid = seaSeaid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }
}