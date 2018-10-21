/**
 * Copyright(c),2018-2018
 * FileName:  LoginBizImpl
 * Author:    旭哥
 * Date:      2018/10/19 8:25
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.biz;

import com.supply.supplymanage.dao.LoginMapper;
import com.supply.supplymanage.entity.Permission;
import com.supply.supplymanage.entity.Role;
import com.supply.supplymanage.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class LoginBizImpl implements LoginBiz{

        @Resource
        private LoginMapper  loginMapper;

    @Override
    public Users getByUsersLogin(String uname, String upwd) {

        Users byUsersLogin = loginMapper.getByUsersLogin(uname, upwd);
        return byUsersLogin;
    }

    @Override
    public Set<String> getRolese(String uname) {
        Set<String> roles = loginMapper.getRoles(uname);
        return roles;
    }

    @Override
    public Set<String> getPermission(String uname) {
        Set<String> permission = loginMapper.getPermission(uname);
        return permission;
    }
}
