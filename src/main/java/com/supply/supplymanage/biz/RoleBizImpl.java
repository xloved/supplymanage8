/**
 * Copyright(c),2018-2018
 * FileName:  RoleBizImpl
 * Author:    旭哥
 * Date:      2018/10/21 15:15
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.biz;

import com.supply.supplymanage.dao.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class RoleBizImpl implements  RoleBiz {

        @Resource
        private RoleMapper roleMapper;
    @Override
    public List<Map> queryRole() {

        return roleMapper.queryRole();
    }
}
