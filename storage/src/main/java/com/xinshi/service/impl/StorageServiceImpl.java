package com.xinshi.service.impl;

import com.xinshi.mapper.StorageMapper;
import com.xinshi.service.StorageService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    /**
     * 扣减库存
     */
    @Override
    public void reduce(Long productId, Integer count) {
        storageMapper.reduce(productId,count);
    }
}

