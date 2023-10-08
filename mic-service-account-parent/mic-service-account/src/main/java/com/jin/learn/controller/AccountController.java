package com.jin.learn.controller;

import com.jin.learn.config.Config;
import com.jin.learn.inteface.AccountFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {


    @Autowired
    private AccountFacade accountFacade;


    @GetMapping(path = "{id}")
    public Object getAccountBasicInfo(@PathVariable String id){
        return "hello world";
    }

}
