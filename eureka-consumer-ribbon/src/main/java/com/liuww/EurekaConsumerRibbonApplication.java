package com.liuww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * eureka 服务消费者主类
 * 使用 @EnableDiscoveryClient 注解将当前应用加入到服务治理体系中
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {

    /**
     * 初始化RestTemplate，用来真正发起REST请求
     * 增加 @LoadBalanced 注解
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }
}
