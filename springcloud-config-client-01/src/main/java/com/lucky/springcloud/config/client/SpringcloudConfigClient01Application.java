package com.lucky.springcloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudConfigClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigClient01Application.class, args);
    }

}
