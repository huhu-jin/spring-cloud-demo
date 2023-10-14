package com.jin.learn.provider;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jin.learn.dto.AccountInfoRequest;
import com.jin.learn.dto.AccountInfoResponse;
import com.jin.learn.inteface.AccountFacade;
import com.jin.learn.service.AccountService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;


@DubboService
public class AccountFacadeImp implements AccountFacade {

    @Autowired
    private AccountService accountService;

    // https://sentinelguard.io/zh-cn/docs/annotation-support.html 注解说明
    @SentinelResource(value = "changeUserWallet", blockHandler = "changeUserWalletBlockHandler" )
    @Override
    public AccountInfoResponse changeUserWallet(AccountInfoRequest request) {
        accountService.doService("");
        System.out.println("成功 改变钱包 ");
        AccountInfoResponse response = AccountInfoResponse.builder().userId(request.getUserId()).status(0).value(request.getValue() + 1).build();
        return response;
    }

    public AccountInfoResponse changeUserWalletBlockHandler(AccountInfoRequest request, BlockException e) {
        System.out.println(e);
        System.out.println("in changeUserWalletBlockHandler");
        return AccountInfoResponse.builder().userId("10086").status(1).value(250).build();

    }
}

