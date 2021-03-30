package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 11:24
 */
public class Car {
    private String name;
    private String color;
    private int percie;

    public Car(String name, String color, int percie) {
        this.name = name;
        this.color = color;
        this.percie = percie;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", percie=" + percie +
                '}';
    }
}
