package com.neo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author zhangxiaoguang
 * @create 2021-04-01 12:21
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource =(DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }
}
