package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 14:18
 */
public class Car {
    private String name;
    private String color;
    private int prces;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrces(int prces) {
        this.prces = prces;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", prces=" + prces +
                '}';
    }
}
