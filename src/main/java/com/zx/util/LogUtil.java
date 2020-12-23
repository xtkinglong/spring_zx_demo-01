package com.zx.util;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LogUtil {

    public static void start(Method method, Object ... objects){
//        System.out.println("XXX方法开始执行"+ Arrays.asList(objects));
        System.out.println(method.getName() + "方法开始执行" + Arrays.asList(objects));
    }

    public static void stop(Method method, Object ... objects){
//        System.out.println("xxx方法执行结束。。"+Arrays.asList(objects));
        System.out.println(method.getName() + "方法执行结束。。" + Arrays.asList(objects));
    }

    public static void logException(Method method, Exception e){
        System.out.println(method.getName()+"方法出现异常" + e.getMessage());
    }

    public  static void endMethod(Method method){
        System.out.println(method.getName()+"方法结束了。。。。。");
    }

}
