package com.xinshi.consumer.rules;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.DefaultResponse;
import org.springframework.cloud.client.loadbalancer.Request;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.cloud.loadbalancer.core.ReactorServiceInstanceLoadBalancer;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Random;

/**
 * @author: xbronze
 * @date: 2025-03-03 22:05
 * @description: 创建一个自定义的负载均衡器：随机策略
 */
public class RandomLoadBalancer implements ReactorServiceInstanceLoadBalancer {

    private final String serviceId;
    private final List<ServiceInstance> instances;
    private final Random random;

    public RandomLoadBalancer(String serviceId, List<ServiceInstance> instances) {
        this.serviceId = serviceId;
        this.instances = instances;
        this.random = new Random();
    }

    @Override
    public Mono<Response<ServiceInstance>> choose(Request request) {
        if (instances.isEmpty()) {
            return Mono.empty();
        }
        // 随机选择一个实例
        ServiceInstance instance = instances.get(random.nextInt(instances.size()));
        return Mono.just(new DefaultResponse(instance));
    }
}
