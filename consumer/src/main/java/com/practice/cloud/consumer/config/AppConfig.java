package com.practice.cloud.consumer.config;

import com.practice.springcloud.api.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Reference(url = "dubbo://192.168.1.4:20880/com.practice.springcloud.api.IHelloService")
    private IHelloService helloService;

    @Bean
    public ApplicationRunner runner() {
        return args -> System.out.println(helloService.sayHello("dubbo test"));
    }
}
