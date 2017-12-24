package com.liting.aicloud.core.feign.web;

import com.liting.aicloud.core.feign.sao.HelloSAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private HelloSAO helloSAO;

    @GetMapping("/test")
    private String testUrl(){
        return helloSAO.sayHello("test");
    }

}
