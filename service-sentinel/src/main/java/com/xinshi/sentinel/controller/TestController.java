package com.xinshi.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xbronze
 * @date: 2025-03-11 11:49
 * @description: TODO
 */
@RestController
@RequestMapping("/sentinel/test")
public class TestController {

    //
    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }

    // 流控规则测试

    /**
     * 流控规则测试： QPS = req/sec = 请求数/秒，即每秒的响应请求数，也即是最大吞吐量
     */
    @GetMapping("/hello")
    public String hello(@RequestParam String name, @RequestParam String age) {
        return "hello , your name: " + name + ", age: " + age;
    }

    /**
     * 热点限流:
     * 在接口限流中，有时来自于多个API的资源请求，它们的url是不同的，但是包含一定的相同关键字。这时候，
     * 就要采用热点限流来对资源的请求进行限制。比如请求中使用“age”这个属性比较多，那么这个关键字可以设定为“热点参数”，
     * 表示只要请求中包含“age”，可以针对这个热点参数设置接口的限流，当请求带有此参数时，如果达到阈值就触发限流，否则不限流
     */
    @GetMapping("/hotpoint")
    @SentinelResource("hotpoint")
    public String hotpoint(String type, String name) {
        return "type:" + type + ", name:" + name;
    }

    /**
     * 系统保护规则是从应用级别的入口流量进行控制，从单台机器的总体 Load、RT、入口 QPS、CPU 使用率和线程数五个维度监控应用数据，
     * 让系统尽可能跑在最大吞吐量的同时保证系统整体的稳定性。
     * 系统保护规则是应用整体维度的，而不是资源维度的，并且仅对入口流量 (进入应用的流量) 生效。
     */
    @GetMapping("/test-sys-rt")
    public String testRT() throws InterruptedException {
        Thread.sleep(200);
        return "test sys rt";
    }

}
