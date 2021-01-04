package com.zx.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWeb implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //设置返回页面的数据
        modelAndView.addObject("msg", "哩哩啦啦");
        //跳转的页面
        modelAndView.setViewName("helotest");
        System.out.println("-------");

        return modelAndView;
    }





}
