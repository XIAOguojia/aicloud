package com.liting.aicloud.core.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@RestController
public class Zuul {
       private static Logger logger = LoggerFactory.getLogger(Zuul.class);

    @GetMapping("/ver.0.1.0-SNAPSHOT")
    public String version(){
        return "";
    }

    public static void main(String[] args) {
        SpringApplication.run(Zuul.class, args);
        logger.info("...............................................................");
        logger.info("..................{} starts successfully", Zuul.class.getSimpleName());
        logger.info("...............................................................");
    }


}
