package com.xinshi.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.exception.MQClientException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @author: xbronze
 * @date: 2025-04-17 18:23
 * @description: TODO
 */
@Configuration
public class RocketMQConsumerConfig {

    @Value("${rocketmq.consumer.group}")
    private String consumerGroup;

    @Value("${rocketmq.consumer.namesrv-addr}")
    private String consumerNamesrvAddr;

    @Value("${rocketmq.consumer.topic}")
    private String topic;

    @Value("${rocketmq.consumer.tag}")
    private String tag;

    @Bean
    public DefaultMQPushConsumer defaultMQPushConsumer() throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(consumerGroup);
        consumer.setNamesrvAddr(consumerNamesrvAddr);
        consumer.subscribe(topic, tag);
        return consumer;
    }

}
