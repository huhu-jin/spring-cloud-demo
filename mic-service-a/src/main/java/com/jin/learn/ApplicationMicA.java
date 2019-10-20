package com.jin.learn;

import com.jin.learn.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ApplicationMicA {

    @Autowired
    private Config config;

    @RequestMapping("/hello")
    public String home() {
        System.out.println(config.getAge());
        System.out.println(config.getName());
        return "refresh";
    }
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMicA.class, args);
    }

}
