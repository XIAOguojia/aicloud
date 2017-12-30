package com.liting.aicloud.core.server.turbine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by liuyi on 28/12/2017.
 */
@SpringBootApplication
@Slf4j
@EnableTurbine
public class ServerTurbine {

    @GetMapping("/ver.0.1.0-SNAPSHOT")
    public String version(){
        return "";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerTurbine.class, args);
        log.info("...............................................................");
        log.info("..................{} starts successfully", ServerTurbine.class.getSimpleName());
        log.info("...............................................................");
    }
}
