package com.xinshi.consumer.controller;

import com.xinshi.consumer.openfeign.IProviderService;
//import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: xbronze
 * @date: 2025-02-28 21:10
 * @description: TODO
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private IProviderService providerService;

    @RequestMapping("/hello")
    public String hello(){
        return providerService.hello();
    }

    @GetMapping("/getPort")
    public String getPort() {
        return providerService.getPort();
    }
}
