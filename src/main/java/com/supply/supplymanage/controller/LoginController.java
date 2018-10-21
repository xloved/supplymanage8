/**
 * Copyright(c),2018-2018
 * FileName:  LoginController
 * Author:    旭哥
 * Date:      2018/10/19 8:27
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.controller;

import com.supply.supplymanage.biz.LoginBiz;
import com.supply.supplymanage.entity.Users;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private LoginBiz loginBiz;

    @RequestMapping(value="/getLoginByName",method = RequestMethod.POST)
    public String  getLoginByName(@RequestParam("uname") String uname,
                                  @RequestParam("upwd") String upwd,HttpSession session){
        //System.out.println(byUsersLogin);
        //把用户名和密码封装为usernamePasswordToken
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(uname,upwd);
        //获取当前的subject,调用 SecurityUtils.getSubject();
        Subject subject= SecurityUtils.getSubject();
        try{
            //完成登录
            subject.login(usernamePasswordToken);
            System.out.println("=============="+usernamePasswordToken);
            //Users user= (Users) subject.getPrincipal();
            session.getAttribute("uanme");
            //更新用户登录时间

           /* session.setAttribute("user",byUsersLogin);
            model.addAttribute("user",byUsersLogin);*/
            return "redirect:/jsp/index.jsp";
        }catch (AuthenticationException ae){
            System.out.println("登录失败"+ae.getMessage());
           /* //("登录失败从request中获取shiro处理的异常信息,shiroLoginFailure:就是shiro异常类的全类名");
              String exception= (String) request.getAttribute("shiroLoginFailure");*/
              /* model.addAttribute("msg",ae.getMessage());*/
               return "redirect:/jsp/login.jsp";
        }

    }

    /**
     * 退出登录
     * @param session
     * @param model
     * @return
     */
   /* @RequestMapping("/Loginout")
    public String Loginout(HttpSession session,Model model){
          Subject subject=SecurityUtils.getSubject();
          subject.logout();
          model.addAttribute("msg","安全退出");
        return "/login";
    }*/
}
