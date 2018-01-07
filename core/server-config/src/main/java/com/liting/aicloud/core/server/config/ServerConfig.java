package com.liting.aicloud.core.server.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by liuyi on 31/12/2017.
 */
@Slf4j
@SpringCloudApplication
@EnableConfigServer
public class ServerConfig {

    public static void main(String[] args) {
        SpringApplication.run(ServerConfig.class, args);
        log.info("...............................................................");
        log.info("..................{} starts successfully", ServerConfig.class.getSimpleName());
        log.info("...............................................................");
    }

}
