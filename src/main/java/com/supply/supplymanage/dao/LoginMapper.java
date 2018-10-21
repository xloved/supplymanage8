/**
 * Copyright(c),2018-2018
 * FileName:  LoginMapper
 * Author:    旭哥
 * Date:      2018/10/18 20:27
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.dao;

import com.supply.supplymanage.entity.Permission;
import com.supply.supplymanage.entity.Role;
import com.supply.supplymanage.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mapper
public interface LoginMapper {
    /**
     * 验证用户登录
     * @param uname
     * @param upwd
     * @return
     */
    Users getByUsersLogin(@Param("uname") String uname, @Param("upwd") String upwd);
    //通过用户查询角色
    Set<String> getRoles(String uname);
    //通过用户查询权限
    Set<String>  getPermission(String uname);

    //查询角色



}
