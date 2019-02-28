package com.lucky.apollo.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/apollo")
public class ApolloController {

    @Value("${pay.notify.url:null}")
    private String payNotifyUrl;

    @Value("${mybatis.type-aliases-package:null}")
    private String typeAliasesPackage;


    @GetMapping("/get")
    public Object get() {
        Map<String, Object> map = new HashMap<>(5);
        map.put("payNotifyUrl", payNotifyUrl);
        map.put("typeAliasesPackage", typeAliasesPackage);
        return map;
    }
}
