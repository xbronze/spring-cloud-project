package com.xinshi.consumer.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: xbronze
 * @date: 2025-02-28 21:24
 * @description: TODO
 */
@FeignClient(value = "service-provider")
public interface IProviderService {

    @GetMapping("/provider/hello")
    public String hello();
}
