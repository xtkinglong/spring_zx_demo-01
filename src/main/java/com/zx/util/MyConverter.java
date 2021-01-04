package com.zx.util;

import com.zx.entity.Usert;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class MyConverter implements Converter<String, Usert> {

    @Override
    public Usert convert(String source) {
        Usert usert = new Usert();
        String[] split = source.split("-");

        for (String s : split) {
            System.out.println("------"+s);
        }

        if(split.length==4 && split!=null){
            usert.setId(Integer.parseInt(split[0]));
            usert.setZx_name(split[1]);
            usert.setZx_age(Integer.parseInt(split[2]));
            usert.setAddres_num(Integer.parseInt(split[3]));
            return usert;
        }else {
            return null;
        }
    }
}
