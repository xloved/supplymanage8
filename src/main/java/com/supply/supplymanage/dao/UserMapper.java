/**
 * Copyright(c),2018-2018
 * FileName:  UserMapper
 * Author:    旭哥
 * Date:      2018/10/15 8:46
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.dao;

import com.supply.supplymanage.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface UserMapper {

       int addUser(Users users);

        List<Map> QueryUser();

        int delUser(Integer usersid);

        int updateUser(Users users);

        Users queryOne(Integer usersid);


}
