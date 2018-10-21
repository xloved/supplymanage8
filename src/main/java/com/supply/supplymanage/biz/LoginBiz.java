/**
 * Copyright(c),2018-2018
 * FileName:  LoginBiz
 * Author:    旭哥
 * Date:      2018/10/19 8:24
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.biz;

import com.supply.supplymanage.entity.Role;
import com.supply.supplymanage.entity.Users;

import java.util.List;
import java.util.Set;


public interface LoginBiz {

    Users getByUsersLogin(String uname, String upwd);

    /**
     * 通过用户查询角色
     * @param
     * @return
     */
    Set<String> getRolese(String uname);

    /**
     * 通过用户查询权限
     * @param
     * @return
     */
    Set<String> getPermission(String uname);
}
