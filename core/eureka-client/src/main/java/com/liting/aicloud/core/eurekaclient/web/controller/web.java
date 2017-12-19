package com.liting.aicloud.core.eurekaclient.web.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class web {

    @GetMapping("/hello")
    public String hello(String name){
        System.out.println("hello: " + name);
        return name;
    }


}
