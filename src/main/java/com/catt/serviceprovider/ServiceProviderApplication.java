package com.catt.serviceprovider;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/***
* @Author: Huang Zhi Jie
* @Description: http://localhost:8003/order/getTestPort
* @Date: 2020/7/14  19:44
* @Param null:
* @return: null
**/
@SpringBootApplication
@EnableEurekaClient
public class ServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /***
     * @Author: Huang Zhi Jie
     * @Description: 定义负载均衡策略为随机访问
     * @Date: 2020/5/27  14:25
     * @Param null:
     * @return: null
     **/
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
