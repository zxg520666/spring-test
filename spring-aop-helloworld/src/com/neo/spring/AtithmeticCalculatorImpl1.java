package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-04-06 16:14
 */
public class AtithmeticCalculatorImpl1 implements  AtithmeticCalculator {

    @Override
    public int add(int i, int j) {
        int result=i+j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result=i-j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result=i*j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result=i/j;
        return result;
    }
}
