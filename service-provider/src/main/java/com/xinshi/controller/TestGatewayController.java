package com.xinshi.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xbronze
 * @date: 2025-03-07 14:40
 * @description: TODO
 */
@RestController
@RequestMapping("/provider/test")
public class TestGatewayController {

    // 测试网关过滤器工程 AddRequestHeader
    @GetMapping("/gateway/head")
    public String testGatewayHead(HttpServletRequest request, HttpServletResponse response) {
        String head = request.getHeader("X-Request-red");
        return "X-Request-red: " + head;
    }

    // 测试网关过滤器工程 AddRequestParameter
    @GetMapping("/gateway/param")
    public String testGatewayParam(HttpServletRequest request, HttpServletResponse response) {
        String color = request.getParameter("color");
        return "param color is: " + color;
    }

    // 测试网关过滤器工程 RemoveRequestHeader
    @GetMapping("/gateway/resheader")
    public String resheader(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("X-Response-City", "xinyang");
        return "ok";
    }
}
