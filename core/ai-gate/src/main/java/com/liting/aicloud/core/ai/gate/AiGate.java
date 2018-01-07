package com.liting.aicloud.core.ai.gate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by liuyis on 01/01/2018.
 */
@Slf4j
@SpringCloudApplication
@EnableZuulProxy
public class AiGate {

    public static void main(String[] args) {
        SpringApplication.run(AiGate.class, args);
        log.info("...............................................................");
        log.info("..................{} starts successfully", AiGate.class.getSimpleName());
        log.info("...............................................................");
    }
}

