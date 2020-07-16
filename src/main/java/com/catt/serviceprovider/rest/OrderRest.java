package com.catt.serviceprovider.rest;

import com.catt.serviceprovider.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Huang Zhi Jie
 * @time: 2020/5/24 10:31
 */
@RestController
@RequestMapping("/order")
public class OrderRest {
    @Resource
    OrderService orderService;

    @GetMapping("/getTestPort")
    public String getTestPort() {
        return orderService.getTestPort();
    }
}
