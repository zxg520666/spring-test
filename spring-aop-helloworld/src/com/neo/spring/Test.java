package com.neo.spring;

/**
 * @author zhangxiaoguang
 * @create 2021-04-06 16:09
 */
public class Test {
    public static void main(String[] args) {
     AtithmeticCalculator target=new AtithmeticCalculatorImpl1();
     AtithmeticCalculator poxy = new ArithmeticCalculatorLoggingPoxy(target).getLoggingProxy();
     int result=poxy.add(1,2);
        System.out.println("--->"+result);
     result=poxy.div(4,2);
        System.out.println("--->"+result);
    }
}
