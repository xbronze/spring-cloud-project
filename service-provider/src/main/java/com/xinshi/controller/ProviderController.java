package com.xinshi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xbronze
 * @date: 2025-02-28 20:49
 * @description: TODO
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${school.name}")
    private String schoolName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(){
        return "hello " + schoolName;
    }

    @GetMapping("/getPort")
    public String getPort() {
        return "server port: " + this.port;
    }
}
