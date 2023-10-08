package com.jin.learn.inteface;

import com.jin.learn.dto.OrderInfoRequest;
import com.jin.learn.dto.OrderInfoResponse;

public interface OrderFacade {

    OrderInfoResponse saveOrder(OrderInfoRequest request);

}
