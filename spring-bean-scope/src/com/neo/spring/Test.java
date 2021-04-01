package com.neo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangxiaoguang
 * @create 2021-04-01 10:08
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //Persion persion1 = (Persion) ctx.getBean("persion");

        //Persion persion2 = (Persion) ctx.getBean("persion");

        //System.out.println(persion1==persion2);

    }
}
