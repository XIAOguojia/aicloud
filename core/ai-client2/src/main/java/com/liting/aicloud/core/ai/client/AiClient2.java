package com.liting.aicloud.core.ai.client;

import com.liting.aicloud.core.ai.client.sao.ClientSAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liuyis on 01/01/2018.
 */
@Slf4j
@SpringCloudApplication
@RestController
@EnableFeignClients
public class AiClient2 {

    @Autowired
    private ClientSAO clientSAO;

    @GetMapping("/test")
    public String test() {
        return clientSAO.testSAO();
    }

    public static void main(String[] args) {
        SpringApplication.run(AiClient2.class, args);
        log.info("...............................................................");
        log.info("..................{} starts successfully", AiClient2.class.getSimpleName());
        log.info("...............................................................");
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
