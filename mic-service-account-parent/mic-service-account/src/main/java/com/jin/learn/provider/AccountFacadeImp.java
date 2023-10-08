package com.jin.learn.provider;

import com.jin.learn.dto.AccountInfoRequest;
import com.jin.learn.dto.AccountInfoResponse;
import com.jin.learn.inteface.AccountFacade;
import com.jin.learn.service.AccountService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;


@DubboService
public class AccountFacadeImp implements AccountFacade {

    @Autowired
    private AccountService accountService;

    @Override
    public AccountInfoResponse changeUserWallet(AccountInfoRequest request) {
        accountService.doService("");
        System.out.println("成功 改变钱包 ");
        AccountInfoResponse response = AccountInfoResponse.builder().userId(request.getUserId()).status(0).value(request.getValue() + 1).build();
        return response;
    }
}

