package com.xinshi;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.xinshi.mapper")
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableAutoDataSourceProxy
public class OrderApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(OrderApplication.class, args);
    }
}
