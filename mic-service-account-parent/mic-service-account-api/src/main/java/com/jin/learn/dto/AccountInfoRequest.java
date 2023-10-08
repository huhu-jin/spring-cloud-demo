package com.jin.learn.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountInfoRequest implements Serializable {

    public String userId;

    public Integer value;


}
