package com.jin.learn.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderInfoResponse implements Serializable {

    public String userId;

    public Integer status;


}
