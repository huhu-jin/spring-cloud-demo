package com.jin.learn.provider;

import com.jin.learn.dto.OrderInfoRequest;
import com.jin.learn.dto.OrderInfoResponse;
import com.jin.learn.inteface.OrderFacade;
import com.jin.learn.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class AccountFacadeImp implements OrderFacade {

    @Autowired
    private OrderService orderService;


    @Override
    public OrderInfoResponse saveOrder(OrderInfoRequest request) {
        System.out.println("save the order");
        return new OrderInfoResponse();
    }
}

