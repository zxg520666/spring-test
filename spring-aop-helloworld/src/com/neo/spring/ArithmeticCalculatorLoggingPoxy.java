package com.neo.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author zhangxiaoguang
 * @create 2021-04-06 16:17
 */
public class ArithmeticCalculatorLoggingPoxy {
    //要代理的对象
    private AtithmeticCalculator target;

    public ArithmeticCalculatorLoggingPoxy(AtithmeticCalculator target) {
        this.target = target;
    }

    public AtithmeticCalculator getLoggingProxy(){
        AtithmeticCalculator proxy=null;
        //代理对象由哪一个类加载器负责加载
        ClassLoader loader=target.getClass().getClassLoader();
        //代理对象的类型，即其中有哪些方法
        Class[] interfaces=new Class[]{AtithmeticCalculator.class};
        //当调用代理对象其中的方法时，该执行的代码
        InvocationHandler h=new InvocationHandler() {
            /**
             *
             * @param proxy 正在返回的那个代理对象
             * @param method 正在被调用的方法
             * @param args 调用方法时传入的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                //日志
                System.out.println("The method"+methodName+"begins with"+ Arrays.asList(args));
                //执行方法返回结果
                Object result = method.invoke(target, args);
                System.out.println("The method"+methodName+"end with"+result);
                return result;
            }
        };
        proxy= (AtithmeticCalculator)Proxy.newProxyInstance(loader,interfaces,h);
        return proxy;
    }

}
