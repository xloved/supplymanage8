package com.supply.supplymanage.entity;

public class Role {
    private Integer roleid;

    private String rolename;

    private String rolewrite;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolewrite() {
        return rolewrite;
    }

    public void setRolewrite(String rolewrite) {
        this.rolewrite = rolewrite == null ? null : rolewrite.trim();
    }
}