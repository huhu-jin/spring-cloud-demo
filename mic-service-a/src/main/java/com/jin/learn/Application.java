package com.jin.learn;

import com.jin.learn.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Application {

    @Autowired
    private Config config;



    @RequestMapping("/hello")
    public String home() {
        System.out.println(config.getLearn());
        return "refresh";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
