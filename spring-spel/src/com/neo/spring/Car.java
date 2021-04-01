package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-04-01 13:53
 */
public class Car {
    private String name;
    private String color;
    private double perce;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerce() {
        return perce;
    }

    public void setPerce(double perce) {
        this.perce = perce;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", perce=" + perce +
                '}';
    }
}
