package com.lucky.apollo.config.client;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableApolloConfig
public class ApolloConfigClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(ApolloConfigClient01Application.class, args);
    }

}
