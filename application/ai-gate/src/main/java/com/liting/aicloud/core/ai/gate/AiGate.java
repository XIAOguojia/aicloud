package com.liting.aicloud.core.ai.gate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by liuyis on 01/01/2018.
 */
@Slf4j
@SpringCloudApplication
@EnableZuulProxy
public class AiGate implements CommandLineRunner{
    @Value("${spring.application.name}")
    private String app;
    @Value("${application.version}")
    private String version;

    public static void main(String[] args) {
        SpringApplication.run(AiGate.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("...............................................................");
        log.info("App: [{}] starts successfully", app);
        log.info("Version: {}", version);
        log.info("...............................................................");
    }
}

