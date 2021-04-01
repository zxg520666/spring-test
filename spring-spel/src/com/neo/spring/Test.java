package com.neo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangxiaoguang
 * @create 2021-04-01 13:50
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Persion persion = (Persion) ctx.getBean("persion");
        Car car = ctx.getBean(Car.class);
        Book book =(Book) ctx.getBean("book");
        System.out.println(car);
        System.out.println(persion);
        System.out.println(book);
    }

}
