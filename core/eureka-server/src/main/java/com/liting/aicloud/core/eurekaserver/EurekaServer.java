package com.liting.aicloud.core.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableEurekaServer
@Controller
public class EurekaServer {

    private static Logger logger = LoggerFactory.getLogger(EurekaServer.class);

    @GetMapping("/ver.1.0-SNAPSHOT")
    public String version(){
        return "";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
        logger.info("...............................................................");
        logger.info("..................{} starts successfully", EurekaServer.class.getSimpleName());
        logger.info("...............................................................");
    }
}
