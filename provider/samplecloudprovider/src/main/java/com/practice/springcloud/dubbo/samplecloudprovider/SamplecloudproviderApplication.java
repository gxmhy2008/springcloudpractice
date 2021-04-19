package com.practice.springcloud.dubbo.samplecloudprovider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class SamplecloudproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplecloudproviderApplication.class, args);
    }

}
