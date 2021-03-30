package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-03-30 10:36
 */
public class Car {
    private String brand;
    private String corop;
    private int price;
    private double maxSpeed;

    public Car(String brand, String corop, int price) {
        this.brand = brand;
        this.corop = corop;
        this.price = price;
    }

    public Car(String brand, String corop, double maxSpeed) {
        this.brand = brand;
        this.corop = corop;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corop='" + corop + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
