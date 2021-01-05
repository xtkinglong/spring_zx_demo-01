package com.zx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestInterceptor {

    @RequestMapping("interceptor")
    public String testInter(Model model){
        Model model1 = model.addAttribute("msg", "sss");
        System.out.println("interXXXXX------");
        return "helotest";
    }
}
