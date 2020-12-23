package com.zx.dao.impl;

import com.zx.dao.Calculator;
import com.zx.util.LogUtil;

import java.lang.reflect.Method;

public class MyCalculator implements Calculator {
    Class<MyCalculator> myCalculatorClass = MyCalculator.class;
    public int add(int i, int j) {
//        System.out.println("add 方法开始执行，参数为："+i+","+j);
//        将如上输出日志的形式修改为通过工具类进行日志输出

        Method add = null;
        try {
            add = myCalculatorClass.getMethod("add", int.class, int.class);
        } catch (NoSuchMethodException e) {
            LogUtil.logException(add,e);
        }


//        MyCalculator myCalculator = myCalculatorClass.newInstance();
//        Object invoke = add.invoke(myCalculator, 1, 2);


        LogUtil.start(add, i, j);

        int result = i + j;
//        System.out.println("add 方法开始完成结果为："+result);
//        将如上输出日志的形式修改为通过工具类进行日志输出
        LogUtil.stop(add, i, j);

        return result;
    }

    public int sub(int i, int j) {
//        System.out.println("sub 方法开始执行，参数为："+i+","+j);
        try {
            myCalculatorClass.getMethod("sub", int.class, int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        int result = i - j;
//        System.out.println("sub 方法开始完成结果为："+result);
        return result;
    }

    public int mult(int i, int j) {
        System.out.println("mult 方法开始执行，参数为："+i+","+j);

        int result = i * j;
        System.out.println("mult 方法开始完成结果为："+result);

        return result;
    }

    public int div(int i, int j) {
        System.out.println("div 方法开始执行，参数为："+i+","+j);

        int result = i / j;
        System.out.println("div 方法开始完成结果为："+result);

        return result;
    }

}
