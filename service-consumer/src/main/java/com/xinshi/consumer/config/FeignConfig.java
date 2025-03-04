package com.xinshi.consumer.config;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xbronze
 * @date: 2025-03-03 22:10
 * @description: 指定服务使用自定义的负载均衡器
 */
@Configuration
@LoadBalancerClients({
        @LoadBalancerClient(name = "service-provider", configuration = RandomLoadBalancerConfig.class)
})
public class FeignConfig {
}
