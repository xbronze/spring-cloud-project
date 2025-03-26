package com.xinshi.service;

import com.xinshi.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "storage")
public interface StorageService {

    /**
     * 扣减库存
     */
    @PostMapping(value = "/storage/reduce")
    CommonResult reduce(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
