package com.zx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/testper")
public class RestController {


    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public String add(Model model){
        model.addAttribute("msg", "add");
        System.out.println("add----");
        return "helotest";
    }
    @RequestMapping(value = "/person/{id}",method = RequestMethod.DELETE)
    public String delete(Model model,@PathVariable("id") int id){
        model.addAttribute("msg", "det"+id);
        System.out.println("det----"+id);
        return "helotest";
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.PUT)
    public String update(Model model,@PathVariable("id") int id){
        model.addAttribute("msg", "update"+id);
        System.out.println("update----"+id);
        return "helotest";
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public String query(Model model, @PathVariable("id") int id){
        model.addAttribute("msg", "query"+id);
        System.out.println("query----"+id);
        return "helotest";
    }


    @RequestMapping(value = "/web/{na}")
    public String getWebInfo(Model model ,@PathVariable("na") String ni, @RequestParam(value = "user") String username){
        model.addAttribute("msg", "ni"+ni+"---username"+username);

        return "helotest";
    }
}
