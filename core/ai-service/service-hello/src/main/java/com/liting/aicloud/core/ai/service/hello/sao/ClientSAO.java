package com.liting.aicloud.core.ai.service.hello.sao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by liuyis on 01/01/2018.
 */
@FeignClient("module-hello")
public interface ClientSAO {

    @GetMapping(value = "/hello")
    String testSAO();
}
