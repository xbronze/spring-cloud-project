package com.xinshi.service.impl;

import com.xinshi.domain.Order;
import com.xinshi.mapper.OrderMapper;
import com.xinshi.service.OrderService;
import com.xinshi.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrderServiceImpl implements OrderService
{
    @Resource
    private OrderMapper orderMapper;

    @Resource
    private StorageService storageService;


    /**
     * 创建订单->调用库存服务扣减库存->修改订单状态
     */
    @Override
    @GlobalTransactional
    public void create(Order order) {
        log.info("========>下单开始");
        //创建订单
        orderMapper.create(order);
        //远程调用库存服务扣减库存
        storageService.reduce(order.getProductId(),order.getCount());
        //修改订单状态为已完成
        orderMapper.update(order.getUserId(),0);
        log.info("========>下单结束");
    }
}
