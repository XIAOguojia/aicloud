package com.liting.aicloud.core.ai.client.sao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by liuyis on 01/01/2018.
 */
@FeignClient("ai-client")
public interface ClientSAO {

    @GetMapping(value = "/test")
    String testSAO();
}
