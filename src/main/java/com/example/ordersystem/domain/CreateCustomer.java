package com.example.ordersystem.domain;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateCustomer {
    private String name;
    private String address;
    private String phoneNumber;
}
