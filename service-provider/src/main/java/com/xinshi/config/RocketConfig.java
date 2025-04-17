package com.xinshi.config;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xbronze
 * @date: 2025-04-17 18:21
 * @description: TODO
 */
@Configuration
public class RocketConfig {

    @Value("${rocketmq.producer.group}")
    private String producerGroup;

    @Value("${rocketmq.producer.namesrv-addr}")
    private String producerNamesrvAddr;

    @Bean
    public DefaultMQProducer defaultMQProducer() throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer(producerGroup);
        producer.setNamesrvAddr(producerNamesrvAddr);
        producer.start();
        return producer;
    }

}
