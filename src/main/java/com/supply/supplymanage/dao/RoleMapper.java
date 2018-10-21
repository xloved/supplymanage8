/**
 * Copyright(c),2018-2018
 * FileName:  RoleMapper
 * Author:    旭哥
 * Date:      2018/10/21 14:59
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.dao;

import com.supply.supplymanage.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface RoleMapper {

     int addRole(Role role);

     List<Map> queryRole();

}
