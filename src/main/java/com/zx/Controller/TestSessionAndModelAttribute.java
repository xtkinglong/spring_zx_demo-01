package com.zx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class TestSessionAndModelAttribute {
    public String sessionTest(){
        return "helotest";
    }

    public void testModelAttribute(Model model){

    }
}


