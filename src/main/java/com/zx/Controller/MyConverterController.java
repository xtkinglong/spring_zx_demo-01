package com.zx.Controller;

import com.zx.entity.Usert;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyConverterController {

    @RequestMapping("/conver")
    public String converterTest(Usert usert, Model model){

        System.out.println("usert"+usert);

        model.addAttribute("msg", usert);

        return "helotest";
    }

}
