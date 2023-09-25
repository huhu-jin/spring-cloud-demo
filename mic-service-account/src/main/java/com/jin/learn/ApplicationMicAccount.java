package com.jin.learn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationMicAccount {


    public static void main(String[] args) {
        SpringApplication.run(ApplicationMicAccount.class, args);
    }

}
