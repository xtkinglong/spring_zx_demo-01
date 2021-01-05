package com.zx.Controller;


import com.zx.entity.Usert;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JsonController {


    @RequestMapping("testReqEntity")
    public ResponseEntity<String> testReqEntity(){

        String body = "<h1>hello</h1>";
        MultiValueMap<String,String> map =  new HttpHeaders();
        map.add("Set-Cookie", "test投相应");
        return new ResponseEntity<String>(map, HttpStatus.OK);
    }

    @RequestMapping("testHttpEntityBody")
    public String testHttpEntityBody(HttpEntity<String> req , Model model){
        System.out.println(req);
        model.addAttribute("msg",req);

        return "helotest";
    }

    @RequestMapping("testRequestBody")
    public String testRequestBody(@RequestBody String req , Model model){
        System.out.println(req);
        model.addAttribute("msg",req);
        return "helotest";
    }

    @ResponseBody
    @RequestMapping("/json_test")
    public List<Usert> testJsonUsert(@RequestBody Usert usert){

        System.out.println(usert);

        List<Usert> list = new ArrayList<Usert>();

        list.add(new Usert("a",1,1));
        list.add(new Usert("b",2,1));
        list.add(new Usert("c",3,1));

        return list;

    }

    @ResponseBody
    @RequestMapping("testh1")
    public String testH1(){

        return "<h1>success</h1>";
    }
}
