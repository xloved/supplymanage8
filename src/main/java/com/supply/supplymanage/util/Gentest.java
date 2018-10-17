/**
 * Copyright(c),2018-2018
 * FileName:  Gentest
 * Author:    旭哥
 * Date:      2018/10/14 20:17
 * Description:
 * History:
 * <author>  <time>  <version> <desc>
 ***/
package com.supply.supplymanage.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Gentest {

    public static void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //项目根路径不要有中文,我的有中文,所以使用绝对路径
              File configFile = new File("C:/Study/IDEA/supplymanage/src/main/resources/generator.xml");
               ConfigurationParser cp = new ConfigurationParser(warnings);
                Configuration config = cp.parseConfiguration(configFile);
               DefaultShellCallback callback = new DefaultShellCallback(overwrite);
                MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
                myBatisGenerator.generate(null);
                  System.out.println("生成成功！");
         }
        public static void main(String[] args) {
             try {
               generator();
              } catch (Exception e) {
                             e.printStackTrace();
              }
         }

}
