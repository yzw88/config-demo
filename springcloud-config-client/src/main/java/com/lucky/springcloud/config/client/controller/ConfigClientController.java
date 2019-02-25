package com.lucky.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${name:testName}")
    public String name;

    @GetMapping(value = "/getName")
    public Object getName() {

        return "The name is:" + name;
    }
}
