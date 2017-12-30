package com.liting.aicloud.core.server.zipkin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zipkin.server.EnableZipkinServer;

/**
 * Created by liuyi on 28/12/2017.
 */
@SpringBootApplication
@EnableZipkinServer
@Slf4j
@RestController
public class ServerZipkin {

    @GetMapping("/ver.0.1.0-SNAPSHOT")
    public String version(){
        return "";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerZipkin.class, args);
        log.info("...............................................................");
        log.info("..................{} starts successfully", ServerZipkin.class.getSimpleName());
        log.info("...............................................................");
    }
}
