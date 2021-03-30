package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 9:46
 */
public class HelloWord {
    private String name;

    public void setName(String name) {
        System.out.println("hahhsha");
        this.name = name;
    }
    public void getHelloWord(){
        System.out.println("hello"+name);
    }

    public HelloWord() {
        System.out.println("无参构造器");
    }
}
