package com.jin.learn.inteface;

import com.jin.learn.dto.AccountInfoRequest;
import com.jin.learn.dto.AccountInfoResponse;

public interface AccountFacade {

    AccountInfoResponse changeUserWallet(AccountInfoRequest request);

}
