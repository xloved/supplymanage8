/**
 * Copyright(c),2018-2018
 * FileName:  AuthUser
 * Author:    旭哥
 * Date:      2018/10/20 22:04
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.util;

import com.supply.supplymanage.entity.Users;

import java.util.List;

public class AuthUser {

      private Users currentUser;
      private List<String> roles;
      private List<String> permissions;

    public Users getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Users currentUser) {
        this.currentUser = currentUser;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
