package com.zx.proxy;

import com.zx.dao.Calculator;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxy {
    //在 method.invoke(calculator, args); 为匿名内部类使用类外的方法，需要加final
    // 方法中使用Calculator calculator
    //那么需要将Calculator calculator设置为final
    public static Calculator getProxyRes(final Calculator calculator){

        //1、Proxy.newProxyInstance(loader, interfaces, h)中的loader
        ClassLoader classLoader = calculator.getClass().getClassLoader();
        //2、Proxy.newProxyInstance(loader, interfaces, h)interfaces
        //被代理对象的接口
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        //3、Proxy.newProxyInstance(loader, interfaces, h)h

        //方法执行器，执行被代理对象的目标方法
        InvocationHandler h = new InvocationHandler(){

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Object result = null;
                try{
                    System.out.println(method.getClass().getName()+"方法开始执行，参数是"+ Arrays.asList(args));
                    result = method.invoke(calculator, args);
                    System.out.println(method.getClass().getName()+"方法开始执行结果为"+ result);

                }catch (Exception e){
                    System.out.println(method.getName()+"方法出现异常："+ e.getMessage());
                }finally {
                    System.out.println(method.getClass().getName() + "method over");
                }
                return null;
            }
        };

        Object o = Proxy.newProxyInstance(classLoader, interfaces, h);
        return (Calculator) o;
    }
}
