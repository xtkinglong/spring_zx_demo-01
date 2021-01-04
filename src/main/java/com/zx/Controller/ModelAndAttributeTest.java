package com.zx.Controller;


import com.zx.entity.Usert;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("usert")
public class ModelAndAttributeTest {

    Object o1 = null;
    Object o2 = null;
    Object o3 = null;


    @RequestMapping("/modeltest")
    public String output(@ModelAttribute("usert") Usert usert,Model model){
        o1=model;
        System.out.println(usert.toString());


        model.addAttribute("msg",usert.toString());
        System.out.println();
        System.out.println("-------");
        System.out.println(o1==o2);
        System.out.println(o3==usert);
        System.out.println("-------");


        System.out.println(usert.toString());

        return "helotest";

    }

    @ModelAttribute
    public void innerModel(Model model){
        o2=model;
        Usert usert = new Usert();
        usert.setId(1);
        usert.setZx_name("涛哥哥");
        usert.setAddres_num(1);
        usert.setZx_age(12);

        model.addAttribute("usert", usert);

        o3=usert;

        System.out.println("modelAttribute:"+usert);


    }
}
