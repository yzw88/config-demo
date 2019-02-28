package com.lucky.apollo.config.client;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableApolloConfig
public class ApolloConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloConfigClientApplication.class, args);
    }

}
