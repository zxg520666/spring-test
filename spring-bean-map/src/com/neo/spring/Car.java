package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 15:37
 */
public class Car {
    private String name;
    private String corlor;
    private int perce;

    public void setName(String name) {
        this.name = name;
    }

    public void setCorlor(String corlor) {
        this.corlor = corlor;
    }

    public void setPerce(int perce) {
        this.perce = perce;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", corlor='" + corlor + '\'' +
                ", perce=" + perce +
                '}';
    }
}
