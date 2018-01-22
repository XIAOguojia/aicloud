package com.liting.aicloud.core.db.bridge;

import com.liting.aicloud.core.db.bridge.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@Slf4j
@SpringCloudApplication
public class DBBridgeCore implements CommandLineRunner{
    @Value("${spring.application.name}")
    private String app;
    private String version = "1.0.0";

    public static void main(String[] args) {
        SpringApplication.run(DBBridgeCore.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("...............................................................");
        log.info("App: [{}] starts successfully", app);
        log.info("Version: {}", version);
        log.info("...............................................................");

        try {
            BridgeService.Processor<BridgeService.Iface> processor = new BridgeService.Processor<>(new UserService());

            Runnable simple = new Runnable() {
                public void run() {
                    simple(processor);
                }
            };

            new Thread(simple).start();
        } catch (Exception x) {
            x.printStackTrace();
        }   
    }



    public static void simple(BridgeService.Processor processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(9090);

            // Use this for a multithreaded server
            TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));

            System.out.println("Starting the simple server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
