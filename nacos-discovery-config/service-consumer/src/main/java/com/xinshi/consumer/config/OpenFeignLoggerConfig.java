package com.xinshi.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author: xbronze
 * @date: 2025-03-03 21:47
 * @description: TODO
 */
@Configuration
public class OpenFeignLoggerConfig {

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }
}
