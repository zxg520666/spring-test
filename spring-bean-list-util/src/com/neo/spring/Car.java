package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 16:10
 */
public class Car {
    private String name;
    private String color;
    private int preace;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPreace(int preace) {
        this.preace = preace;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", preace=" + preace +
                '}';
    }
}
