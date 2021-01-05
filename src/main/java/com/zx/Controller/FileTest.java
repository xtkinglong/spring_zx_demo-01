package com.zx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Controller
public class FileTest {


    @RequestMapping(value = "/file_sc", method = RequestMethod.POST)
    public String TestFile(@RequestParam(value = "zx_name", required = false) String zxName, @RequestParam(value = "file") MultipartFile[] multipartFile, Model model){
        String path = this.getClass().getClassLoader().getResource("").getPath();



        for (MultipartFile file:multipartFile){
            if(!file.isEmpty()){
                try {
                    System.out.println("path"+path);

                    System.out.println("multipartFile" + file.getOriginalFilename());

                    file.transferTo(new File(path+file.getOriginalFilename()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



        return "helotest";
    }
}
