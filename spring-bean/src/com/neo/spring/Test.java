package com.neo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 10:14
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //Persion persion = (Persion)ctx.getBean("persion");
        //System.out.println(persion.toString());
        Persion persion1 = (Persion)ctx.getBean("persion1");
        System.out.println(persion1.toString());
    }
}
