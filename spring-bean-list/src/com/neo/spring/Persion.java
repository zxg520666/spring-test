package com.neo.spring;

import java.util.List;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 14:17
 */
public class Persion {
    private String name;
    private int age;
    private List<Car> cars;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
