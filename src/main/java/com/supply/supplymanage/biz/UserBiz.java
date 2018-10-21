/**
 * Copyright(c),2018-2018
 * FileName:  UserBiz
 * Author:    旭哥
 * Date:      2018/10/15 10:01
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.biz;

import com.github.pagehelper.PageInfo;
import com.supply.supplymanage.entity.Users;

public interface UserBiz {

     int addUser(Users users);

     PageInfo QuerysUser(Integer pageNum);

     int delUser(Integer usersid);

     int updateUser(Users users);

     Users selectOne(Integer usersid);

}
