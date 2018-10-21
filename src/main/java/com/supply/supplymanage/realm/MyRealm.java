/**
 * Copyright(c),2018-2018
 * FileName:  MyRealm
 * Author:    旭哥
 * Date:      2018/10/18 16:55
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.realm;

import com.supply.supplymanage.biz.LoginBiz;
import com.supply.supplymanage.entity.Role;
import com.supply.supplymanage.entity.Users;
import com.supply.supplymanage.util.AuthUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class MyRealm extends AuthorizingRealm {
           @Resource
           private LoginBiz loginBiz;
    /**
     *验证授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
                      System.out.println("执行授权逻辑");
                SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
                Users user= (Users) SecurityUtils.getSubject();
                String uname= (String) principalCollection.getPrimaryPrincipal();
                      //给用户授予角色
                info.addRoles(loginBiz.getRolese(user.getUname()));
                      //给用户授予权限
                info.addStringPermissions(loginBiz.getPermission(user.getUname()));

                 //info.addStringPermission("jsp:user/addUser");
                     return info;
    }

    /**
     * 验证用户信息
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
                  System.out.println("执行认证逻辑");
            UsernamePasswordToken uptoken= (UsernamePasswordToken) token;

            String uname=uptoken.getUsername();

            String upwd= new String((char[]) token.getCredentials()) ;
            //调用serivce
            Users user = loginBiz.getByUsersLogin(uname, upwd);

            if(user==null){

                  throw new UnknownAccountException("用户不存在");
            }
            if(!upwd.equals(user.getUpwd())){

                 throw new IncorrectCredentialsException("密码错误");
            }
            /*AuthUser authUser=new AuthUser();
            authUser.setCurrentUser(user);*/
            //根据用户ID查询角色
             //authUser.setRoles(this.loginBiz.getRolese(user.getUsersid()));
            //根据用户ID查询权限
            //authUser.setPermissions(this.loginBiz.getPermission(user.getUsersid()));
        //1.principal:认证的实体信息，可以是username，也可以是数据表对应的实体对象名
        //2.credentials:密码
        //3.realmName:当前realm对象的name，调用父类的getName()
        //4.盐值
        ByteSource credentialsSalt=ByteSource.Util.bytes(uname);
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(user,upwd,credentialsSalt,getName());

        return info;
    }
}
 /*String uname= (String) token.getCredentials();
        String upwd= new String((char[]) token.getCredentials()) ;
        Users  users=this.loginBiz.getByUsersLogin(uname,upwd);
        if(users==null){
                  throw new UnknownAccountException("用户名或密码错误");

        }
        if(!upwd.equals(users.getUpwd())){
                 throw new IncorrectCredentialsException("用户名或密码错误！");
        }
        System.out.println("======================"+token);
        //更新最后登录时间
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(users,users.getUpwd(),getName());*/