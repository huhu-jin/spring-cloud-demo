package com.jin.learn.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderInfoRequest implements Serializable {

    public String userId;

    public Integer value;


}
