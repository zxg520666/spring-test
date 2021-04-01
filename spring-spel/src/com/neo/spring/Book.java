package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-04-01 14:19
 */
public class Book {
    private String name;
    private String prece;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrece() {
        return prece;
    }

    public void setPrece(String prece) {
        this.prece = prece;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", prece='" + prece + '\'' +
                '}';
    }
}
