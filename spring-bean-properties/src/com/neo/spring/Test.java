package com.neo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 15:53
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());

    }
}
