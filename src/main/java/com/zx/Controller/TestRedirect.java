package com.zx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestRedirect {
    @RequestMapping("/td")
    public String testDriect(){
        return "redirect:user_test.jsp";
    }

    @RequestMapping("/td1")
    public String testDriect1(){
        return "redirect:td";
    }

    @RequestMapping("tf")
    public String testForward(){
        return "forward:user_test.jsp";
    }

    @RequestMapping("tf1")
    public String testForward1(){
        return "forward:tf";
    }
}
