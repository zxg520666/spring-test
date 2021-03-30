package com.neo.spring;

import java.util.Map;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 15:37
 */
public class Persion {
    private String name;
    private int age;
    private Map<String,Car> carMap;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carMap=" + carMap +
                '}';
    }
}
