package com.liting.aicloud.core.ai.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuyis on 01/01/2018.
 */
@Slf4j
@SpringCloudApplication
@RestController
public class AiClient {

    @Value("${test}")
    private String test;

    @GetMapping("/test")
    public String test() {
        return test;
    }

    public static void main(String[] args) {
        SpringApplication.run(AiClient.class, args);
        log.info("...............................................................");
        log.info("..................{} starts successfully", AiClient.class.getSimpleName());
        log.info("...............................................................");
        
    }
}
