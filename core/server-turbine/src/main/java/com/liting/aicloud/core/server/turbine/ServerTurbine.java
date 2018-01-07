package com.liting.aicloud.core.server.turbine;

import lombok.extern.slf4j.Slf4j;
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
public class ServerTurbine {

    public static void main(String[] args) {
        SpringApplication.run(ServerTurbine.class, args);
        log.info("...............................................................");
        log.info("..................{} starts successfully", ServerTurbine.class.getSimpleName());
        log.info("...............................................................");
    }
}
