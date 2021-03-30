package com.neo.spring;

import java.util.List;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 16:10
 */
public class Persion {
    private String name;
    private int age;
    private List<Car> carList;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                '}';
    }
}
