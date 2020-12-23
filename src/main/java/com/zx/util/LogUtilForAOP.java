package com.zx.util;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
@Aspect
public class LogUtilForAOP {

    @Before("execution(public int com.zx.dao.impl.MyCalculatorForAOP.*(int,int))")
    public static void start(){
//        System.out.println("XXX方法开始执行"+ Arrays.asList(objects));
        System.out.println( "---AOP---方法开始执行");
    }

    @AfterReturning("execution(public int com.zx.dao.impl.MyCalculatorForAOP.*(int,int))")
    public static void stop(){
//        System.out.println("xxx方法执行结束。。"+Arrays.asList(objects));
        System.out.println("---AOP----方法执行结束。。" );
    }

    @AfterThrowing("execution(public int com.zx.dao.impl.MyCalculatorForAOP.*(int,int))")
    public static void logException(){
        System.out.println("方法出现异常");
    }

    @After("execution(public int com.zx.dao.impl.MyCalculatorForAOP.*(int,int))")
    public  static void endMethod(){
        System.out.println("----AOP---方法结束了。。。。。");
    }

}
