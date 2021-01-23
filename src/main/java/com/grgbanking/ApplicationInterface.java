package com.grgbanking;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: lzyang6
 * @License: (C) Copyright 2020-2020, grgbanking Corporation Limited.
 * @Contact: lzyang6@grgbanking.com
 * @Date: 2021/1/23 23:41
 * @Version: 1.0
 * @Description:
 */
@SpringBootApplication
public class ApplicationInterface {

    @Value("${lzyang.name}")
    private String workName;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationInterface.class, args);
    }

    @RequestMapping("/getName")
    @ResponseBody
    public String getName(){
        return workName;
    }
}
