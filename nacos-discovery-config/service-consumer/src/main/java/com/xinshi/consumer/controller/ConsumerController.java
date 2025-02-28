package com.xinshi.consumer.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: xbronze
 * @date: 2025-02-28 21:10
 * @description: TODO
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {


    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/hello")
    public String hello(){
        return restTemplate.getForObject("http://service-provider/provider/hello",String.class);
    }
}
