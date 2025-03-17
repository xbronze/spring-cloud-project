package com.xinshi.service;

import com.xinshi.dubboapi.com.xinshi.dubboapi.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
*@author: xbronze
*@date: 2025-03-17 21:50
*@description: TODO
*/
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
