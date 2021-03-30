package com.neo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 9:46
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //HelloWord helloWord =(HelloWord) ctx.getBean("helloWord");
        //helloWord.getHelloWord();
        Car car = (Car)ctx.getBean("car");
        System.out.println(car.toString());
        Car car1 = (Car)ctx.getBean("car1");
        System.out.println(car1.toString());

    }


}
