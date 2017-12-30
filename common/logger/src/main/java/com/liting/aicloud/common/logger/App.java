package com.liting.aicloud.common.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by liuyi on 28/12/2017.
 */
@SpringBootApplication
public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    @GetMapping("/ver.0.1.0-SNAPSHOT")
    public String version(){
        return "";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        logger.info("...............................................................");
        logger.info("..................{} starts successfully", App.class.getSimpleName());
        logger.info("...............................................................");
    }
}
