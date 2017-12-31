package com.liting.aicloud.core.eurekaclient.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class web {

    private String config;

    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("hello: " + name);
        System.out.println("config: " + config);
        return name;
    }


}
