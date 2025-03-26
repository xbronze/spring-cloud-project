package com.xinshi.controller;

import com.xinshi.domain.CommonResult;
import com.xinshi.domain.Order;
import com.xinshi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     * http://localhost:8001/order/create?userId=1&productId=1&count=10&money=100
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}

