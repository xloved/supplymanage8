/**
 * Copyright(c),2018-2018
 * FileName:  ShiroConfig
 * Author:    旭哥
 * Date:      2018/10/18 17:12
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.util;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.supply.supplymanage.realm.MyRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.RememberMeManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;

import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;
//shiro的配置类
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shirFilter(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 设置 SecurityManager安全管理器
       shiroFilterFactoryBean.setSecurityManager(securityManager);
        /**
         * shiro内置过滤器，可以实现权限相关的拦截器
         * anon:无需认证可以访问
         * authc：必须认证才可以访问
         * user：如果使用rememberMe的功能可以直接访问
         * perms:该资源必须得到资源权限才可以访问
         * role：该资源必须得到角色权限才可以访问
         */

        //访问的是后端url地址为 /login的接口
        shiroFilterFactoryBean.setLoginUrl("/jsp/login.jsp");
        // 登录成功后要跳转的链接
        shiroFilterFactoryBean.setSuccessUrl("/jsp/index.jsp");
        // 未授权界面;
       shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");
        // 拦截器.
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        // 配置不会被拦截的链接 顺序判断
       /* filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/ajaxLogin", "anon");
        filterChainDefinitionMap.put("/userlogin", "anon");*/

        // 配置退出过滤器,其中的具体的退出代码Shiro已经替我们实现了

        filterChainDefinitionMap.put("/logout", "logout");

        //配置某个url需要某个权限码

        //filterChainDefinitionMap.put("/hello", "perms[how_are_you]");

        // 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边
        // <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
          //filterChainDefinitionMap.put("/", "user");
        filterChainDefinitionMap.put("/login/getLoginByName","anon");
        filterChainDefinitionMap.put("/jsp/**", "authc");
        //授权过滤器
        Map<String,String> permissions=new LinkedHashMap<String ,String>();
        permissions.put("/user/addUser","perms[user:addUser]");
        filterChainDefinitionMap.putAll(permissions);
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        System.out.println("Shiro拦截器工厂类注入成功");
        return shiroFilterFactoryBean;
    }

    //配置核心安全事务管理器
    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("myRealm") MyRealm myRealm){


        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(myRealm);
        return securityManager;
    }



    /**
     * 身份认证realm;
     * @return
     */
    @Bean(name="myRealm")
    public MyRealm getRealm() {
        MyRealm myRealm = new MyRealm();
        System.out.println(myRealm+"-------->");

        return myRealm;
    }

    /**
     * 配置ShiroDialect，用于thymeleaf和shiro配合使用
     * @return
     */
    @Bean
    public ShiroDialect getShiroDialect(){

        return new ShiroDialect();
    }

    /**
     * 创建HashedCredentialsMatcher类，对密码进行编码
     * @return
     */
    @Bean(name="getHashedCredentialsMatcher")
    public HashedCredentialsMatcher getHashedCredentialsMatcher(){
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
         credentialsMatcher.setHashAlgorithmName("MD5");
         credentialsMatcher.setHashIterations(2);
         credentialsMatcher.setStoredCredentialsHexEncoded(true);

        return credentialsMatcher;
    }
}

