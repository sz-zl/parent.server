package com.p2p.yk.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s==null||s.equals("")){
            try {
                throw new IllegalAccessException("没传入参数");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(s);
        } catch (ParseException e) {
            System.out.println("参数格式错误");
            e.printStackTrace();
        }
        return null;
    }
}
