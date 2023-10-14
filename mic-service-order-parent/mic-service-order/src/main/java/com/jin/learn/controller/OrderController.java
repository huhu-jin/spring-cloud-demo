package com.jin.learn.controller;


import com.jin.learn.dto.AccountInfoRequest;
import com.jin.learn.dto.AccountInfoResponse;
import com.jin.learn.inteface.AccountFacade;
import com.jin.learn.inteface.OrderFacade;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {


    @Autowired
    private OrderFacade orderFacade;

    @DubboReference(timeout = 10000,check = false)
    private AccountFacade accountFacade;


    @GetMapping(path = "{id}")
    public Object saveOrder(@PathVariable String id){
        AccountInfoRequest request = new AccountInfoRequest();
        request.setUserId(id);
        request.setValue(Integer.valueOf(id));
        AccountInfoResponse accountInfoResponse = accountFacade.changeUserWallet(request);
        return accountInfoResponse;
    }

}
