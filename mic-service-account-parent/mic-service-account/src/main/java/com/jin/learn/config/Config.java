package com.jin.learn.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="jin.learn")
@RefreshScope
@Data
public class Config {

    private String name;

    private Integer age;


}
