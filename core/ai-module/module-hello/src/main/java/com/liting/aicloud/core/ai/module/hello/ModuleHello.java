package com.liting.aicloud.core.ai.module.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuyis on 07/01/2018.
 */
@Slf4j
@SpringCloudApplication
@RestController
public class ModuleHello implements CommandLineRunner{

    @Value("${spring.application.name}")
    private String app;
    private String version = "1.0.0";

    @GetMapping("/hello")
    public String test() {
        log.info("hello1");
        return app;
    }

    public static void main(String[] args) {
        SpringApplication.run(ModuleHello.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("...............................................................");
        log.info("App: [{}] starts successfully", app);
        log.info("Version: {}", version);
        log.info("...............................................................");
    }
}
