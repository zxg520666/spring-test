package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 11:24
 */
public class Persion {
    private String name;
    private int age;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
