package com.liting.aicloud.core.eurekaclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringCloudApplication
@RestController
public class Client {

    @GetMapping("/ver.0.1.0-SNAPSHOT")
    public String version(){
        return "";
    }

    @Value("${spring.application.name}")
    private static String serviceId;

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
        log.info("...............................................................");
        log.info("..................{} starts successfully", serviceId);
        log.info("...............................................................");
    }

}
