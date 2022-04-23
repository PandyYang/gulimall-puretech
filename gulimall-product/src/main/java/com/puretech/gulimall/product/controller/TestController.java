package com.puretech.gulimall.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("test.value")
    private String testValue;

    public void test(){

    }
}
