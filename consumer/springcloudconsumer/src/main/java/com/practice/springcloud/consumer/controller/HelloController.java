package com.practice.springcloud.consumer.controller;

import com.practice.springcloud.api.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference
    private IHelloService helloService;

    @GetMapping("/say")
    public String sayHello() {
        return helloService.sayHello("Test Dubbo Function");
    }
}
