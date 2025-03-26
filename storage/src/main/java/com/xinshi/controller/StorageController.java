package com.xinshi.controller;

import com.xinshi.domain.CommonResult;
import com.xinshi.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/reduce")
    public CommonResult reduce(Long productId, Integer count) {
        storageService.reduce(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
