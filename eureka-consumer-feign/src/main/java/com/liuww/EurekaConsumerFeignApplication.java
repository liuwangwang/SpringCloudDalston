package com.liuww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * eureka 服务消费者主类
 * 使用 @EnableDiscoveryClient 注解将当前应用加入到服务治理体系中
 * 使用 @EnableFeignClients 注解开启扫描Spring Cloud Feign客户端的功能
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeignApplication.class, args);
    }
}
