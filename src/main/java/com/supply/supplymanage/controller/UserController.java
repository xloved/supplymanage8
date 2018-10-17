/**
 * Copyright(c),2018-2018
 * FileName:  UserController
 * Author:    旭哥
 * Date:      2018/10/15 10:25
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.controller;

import com.github.pagehelper.PageInfo;
import com.supply.supplymanage.biz.UserBiz;
import com.supply.supplymanage.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserBiz UserBiz;

    @RequestMapping("/addUser")
    @ResponseBody
    public Users addUser( Users users){
        UserBiz.addUser(users);
        System.out.println(users);
        return users;
    }

    @RequestMapping("/QueryUsers/{pageNum}")
    @ResponseBody
    public PageInfo QueryUser(@PathVariable("pageNum") int pageNum){
        System.out.println(pageNum);
        PageInfo pageInfo = UserBiz.QuerysUser(pageNum);
        System.out.println(pageInfo);
         return pageInfo;
    }

    @RequestMapping("/delUsers/{usersid}")
    @ResponseBody
    public String delUsers(@PathVariable("usersid") int usersid){
        UserBiz.delUser(usersid);
        System.out.println("bianhao"+UserBiz.delUser(usersid));
        return "forward:QueryUsers";
    }

    @RequestMapping("/queryOne")
    public @ResponseBody Users queryOne(Integer usersid){
          UserBiz.selectOne(usersid);
        return null;
    }
}
