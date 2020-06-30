package com.jacarrichan.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public String home() {
        return "Hello World from port " + port;
    }
}
