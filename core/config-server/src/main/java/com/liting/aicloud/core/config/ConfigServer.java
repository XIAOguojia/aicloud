package com.liting.aicloud.core.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigServer
public class ConfigServer {
    private static Logger logger = LoggerFactory.getLogger(ConfigServer.class);

    @GetMapping("/ver.0.1.0-SNAPSHOT")
    public String version(){
        return "";
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
        logger.info("...............................................................");
        logger.info("..................{} starts successfully", ConfigServer.class.getSimpleName());
        logger.info("...............................................................");
    }



}
