package com.xinshi.consumer.controller;

import com.xinshi.dubboapi.com.xinshi.dubboapi.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*@author: xbronze
*@date: 2025-03-17 22:22
*@description: TODO
*/
@RestController
@RequestMapping("/consumer/dubbo")
public class ConsumerDubboController {

    @DubboReference(check = false)
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.hello("dubbo");
    }
}
