package com.xinshi.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: xbronze
 * @date: 2025-02-28 21:06
 * @description: TODO
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(ConsumerApplication.class, args);
    }
}
