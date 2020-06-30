package com.jacarrichan.demo.feign.client;

import com.jacarrichan.demo.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getHelloContent();
}