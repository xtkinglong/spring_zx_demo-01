package com.zx.dao.impl;

import com.zx.dao.Calculator;
import com.zx.util.LogUtil;
import com.zx.util.LogUtilForAOP;
import com.zx.util.LogUtilForCGlib;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service
public class MyCalculatorForCGlib{
    public int add(int i, int j) {


        int result = i + j;

        return result;
    }

    public int sub(int i, int j) {

        int result = i - j;
        return result;
    }

    public int mult(int i, int j) {

        int result = i * j;

        return result;
    }

    public int div(int i, int j) {

        int result = i / j;

        return result;
    }

}
