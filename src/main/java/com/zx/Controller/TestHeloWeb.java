package com.zx.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zx.entity.Person;
import com.zx.entity.Usert;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes(value = "test")
public class TestHeloWeb {
    @RequestMapping(value = "/ni")
    public String heloMVC(Model model){

        model.addAttribute("test", "session----");

        Model model1 = model.addAttribute("msg", "命名为 ");

        return "helotest";

    }

    @RequestMapping(value = "/perweb")
    public String personWeb(Model model, Person person){
        model.addAttribute("msg", person.toString());
        System.out.println(person);

        return "helotest";

    }

    /***
     *
     * @param
     * @param
     * @return
     * 原生API支持
     */

    @RequestMapping("/ysapi")
    public String ysApi(HttpSession session, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

        session.setAttribute("zx",new Usert("x",18 ,1));

        httpServletRequest.setAttribute("httpSerReq", this.getClass().getName());

        return "user_test";


    }

    @RequestMapping("/cookie")
    public String getWeb(Model model, @CookieValue("JSESSIONID") String jseid){
        model.addAttribute("msg",jseid);
        return "helotest";

    }




}
