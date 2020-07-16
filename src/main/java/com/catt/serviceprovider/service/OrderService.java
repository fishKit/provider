package com.catt.serviceprovider.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Huang Zhi Jie
 * @time: 2020/5/24 10:32
 */
@Service
public class OrderService {
    @Resource
    RestTemplate restTemplate;

    public String getTestPort() {
        return restTemplate.getForObject("http://catt-service/test/getTestPort/", String.class);
    }
}
