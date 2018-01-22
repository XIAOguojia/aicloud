package com.liting.aicloud.core.server.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuyis on 22/01/2018.
 */
@Slf4j
@SpringCloudApplication
@EnableAdminServer
public class ServerAdmin implements CommandLineRunner{
    @Value("${spring.application.name}")
    private String app;
    private String version = "1.0.0";

    public static void main(String[] args) {
        SpringApplication.run(ServerAdmin.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("...............................................................");
        log.info("App: [{}] is up !!", app);
        log.info("Version: {}", version);
        log.info("...............................................................");
    }
}
