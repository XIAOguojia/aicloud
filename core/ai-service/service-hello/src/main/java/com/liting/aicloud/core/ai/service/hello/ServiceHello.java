package com.liting.aicloud.core.ai.service.hello;

import com.liting.aicloud.core.ai.service.hello.sao.ClientSAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by liuyis on 07/01/2018.
 */
@Slf4j
@SpringCloudApplication
@RestController
@EnableFeignClients
public class ServiceHello implements CommandLineRunner{

    @Value("${spring.application.name}")
    private String app;
    private String version = "1.0.0";

    @Resource
    private ClientSAO clientSAO;

    @GetMapping("/test")
    public String test() {
        log.info("ServiceHello");
        return clientSAO.testSAO();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceHello.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("...............................................................");
        log.info("App: [{}] starts successfully", app);
        log.info("Version: {}", version);
        log.info("...............................................................");
    }
}
