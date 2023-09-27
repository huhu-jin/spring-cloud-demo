package com.jin.learn.controller;

import com.jin.learn.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config/demo")
@RefreshScope
public class NacosTestController {


    @Autowired
    private Config config;

    @Value("${jin.learn.sport:}")
    private String sport;



    @GetMapping
    public String retrieveConfig(){
        return String.format("Name:%s, Age:%s, Sport:%s", config.getName(), config.getAge(), sport);
    }

}
