package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-04-02 10:04
 */
public class Car {
    private String name;

    public Car() {
        System.out.println(".......构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("........stter");
        this.name = name;
    }

    public void init(){
        System.out.println(".......init");
    }

    public void destory(){
        System.out.println(".........destory");
    }
}
