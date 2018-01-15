package com.liting.aicloud.core.server.zipkin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zipkin.server.EnableZipkinServer;

/**
 * Created by liuyi on 28/12/2017.
 */
@SpringCloudApplication
@EnableZipkinServer
@Slf4j
public class ServerZipkin implements CommandLineRunner{
    @Value("${spring.application.name}")
    private String app;
    @Value("${application.version}")
    private String version;

    public static void main(String[] args) {
        SpringApplication.run(ServerZipkin.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("...............................................................");
        log.info("App: [{}] starts successfully", app);
        log.info("Version: {}", version);
        log.info("...............................................................");
    }
}
