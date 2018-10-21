/**
 * Copyright(c),2018-2018
 * FileName:  RoleController
 * Author:    旭哥
 * Date:      2018/10/21 15:20
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.controller;

import com.supply.supplymanage.biz.RoleBiz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {
         @Resource
         private RoleBiz roleBiz;

         @RequestMapping("/queryRole")
         public @ResponseBody List<Map> queryRole(){
             List<Map> maps = roleBiz.queryRole();
             System.out.println(maps);
             return  maps;
         }
}
