package com.lucky.nacos.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${merchant.account:123456}")
    private String merchantAccount;

    @RequestMapping("/get")
    public Object get() {
        Map<String, Object> map = new HashMap<>();
        map.put("merchantAccount", merchantAccount);
        return map;
    }
}
