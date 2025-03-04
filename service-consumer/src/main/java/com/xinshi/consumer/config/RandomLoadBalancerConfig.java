package com.xinshi.consumer.config;

import com.xinshi.consumer.rules.RandomLoadBalancer;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.loadbalancer.core.ReactorServiceInstanceLoadBalancer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xbronze
 * @date: 2025-03-03 22:11
 * @description: 用于注册自定义的负载均衡器
 */
@Configuration
public class RandomLoadBalancerConfig {

    @Bean
    public ReactorServiceInstanceLoadBalancer randomLoadBalancer(DiscoveryClient discoveryClient) {
        return new RandomLoadBalancer("service-provider", discoveryClient.getInstances("service-provider"));
    }

}
