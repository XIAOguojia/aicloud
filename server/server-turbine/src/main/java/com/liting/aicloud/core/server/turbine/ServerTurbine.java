package com.liting.aicloud.core.server.turbine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by liuyi on 28/12/2017.
 */
@Slf4j
@SpringCloudApplication
@EnableTurbine
@EnableHystrixDashboard
public class ServerTurbine implements CommandLineRunner{
    @Value("${spring.application.name}")
    private String app;
    private String version = "1.0.0";

    public static void main(String[] args) {
        SpringApplication.run(ServerTurbine.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("...............................................................");
        log.info("App: [{}] is up !!", app);
        log.info("Version: {}", version);
        log.info("...............................................................");
    }
}
