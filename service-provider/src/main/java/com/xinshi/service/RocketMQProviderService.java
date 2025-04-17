package com.xinshi.service;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class RocketMQProviderService {

    @Autowired
    private DefaultMQProducer defaultMQProducer;

    public void sendMessage() throws UnsupportedEncodingException {
        try {
            Message msg = new Message("FIRST_TEST_TOPIC",
                    "TagA",
                    "Hello RocketMQ!".getBytes(RemotingHelper.DEFAULT_CHARSET));
            defaultMQProducer.send(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}   