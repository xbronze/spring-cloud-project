package com.xinshi.controller;

import com.xinshi.service.RocketMQProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @author: xbronze
 * @date: 2025-04-17 18:14
 * @description: TODO
 */
@RestController
@RequestMapping("/mq")
public class RocketMQProviderController {

    @Autowired
    private RocketMQProviderService rocketMQProviderService;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        try {
            rocketMQProviderService.sendMessage();
            return "Message sent successfully";
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "Failed to send message";
        }
    }

}
