package com.zx.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class LogUtilForXmlCGlib {

//    @Pointcut("execution(public  int  com.zx.dao.impl.MyCalculatorForCGlib.*(int ,int ))")
//    public void myPoint(){}

//    @Before("myPoint()")
    public static void start(JoinPoint joinPoint){
//        System.out.println("XXX方法开始执行"+ Arrays.asList(objects));
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println(name +  "----CGlib方法开始执行---" + Arrays.asList(args));
    }

//    @AfterReturning(value = "myPoint()", returning = "res")
    public static void stop(JoinPoint joinPoint, Integer res){
//        System.out.println("xxx方法执行结束。。"+Arrays.asList(objects));
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();

        System.out.println(name + "------CGlib------方法执行结束。。" +res);
    }

//    @AfterThrowing("myPoint()")
    public static void logException(){
        System.out.println("方法出现异常");
    }

//    @After("myPoint()")
    public  static void endMethod(){
        System.out.println("---CGlib---方法结束了。。。。。");
    }

//    @Around("myPoint()")
    public Object myRound(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        Object proceed = null;
        System.out.println("环绕前通知---"+ name + "方法开始，参数是"+ Arrays.asList(args));

        try {
            proceed = joinPoint.proceed();
            System.out.println("环绕前通知---"+name + "返回值是" +proceed);
        } catch (Throwable throwable) {
            System.out.println("环绕前异常通知---"+name+ "异常信息"+throwable);
        }finally {
            System.out.println("环绕最终执行语句---"+name+"。。。。。。");
        }


        return proceed;


    }

}
