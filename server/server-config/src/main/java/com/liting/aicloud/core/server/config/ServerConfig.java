package com.liting.aicloud.core.server.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by liuyi on 31/12/2017.
 */
@Slf4j
@SpringCloudApplication
@EnableConfigServer
public class ServerConfig implements CommandLineRunner{
    @Value("${spring.application.name}")
    private String app;
    private String version;

    public static void main(String[] args) {
        SpringApplication.run(ServerConfig.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("...............................................................");
        log.info("App: [{}] starts successfully", app);
        log.info("Version: {}", version);
        log.info("...............................................................");
    }

}
