/**
 * Copyright(c),2018-2018
 * FileName:  UserBizImpl
 * Author:    旭哥
 * Date:      2018/10/15 10:20
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.biz;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supply.supplymanage.dao.UserMapper;
import com.supply.supplymanage.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserBizImpl implements UserBiz{

      @Resource
      private UserMapper UserMapper;
    @Override
    public int addUser(Users users) {
      UserMapper.addUser(users);
        return 0;
    }

    @Override
    public PageInfo QuerysUser(Integer pageNum) {
       PageHelper.startPage(pageNum,3);
        List<Map> maps = UserMapper.QueryUser();
        PageInfo<Map> pageInfo = new PageInfo<Map>(maps);
        return pageInfo;
    }

    @Override
    public int delUser(Integer usersid) {
           UserMapper.delUser(usersid);
        return 0;
    }

    @Override
    public void updateUser(Users users) {
      UserMapper.updateUser(users);
    }

    @Override
    public Users selectOne(Integer usersid) {
        Users users = UserMapper.queryOne(usersid);
        return users;
    }
}
