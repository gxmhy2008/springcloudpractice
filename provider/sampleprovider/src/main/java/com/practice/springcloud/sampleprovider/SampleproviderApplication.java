package com.practice.springcloud.sampleprovider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class SampleproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleproviderApplication.class, args);
    }

}
