package com.liting.aicloud.core.feign.sao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client.hello")
public interface HelloSAO {

    @GetMapping(value = "/hello")
    String sayHello(@RequestParam("name") String name);

}
