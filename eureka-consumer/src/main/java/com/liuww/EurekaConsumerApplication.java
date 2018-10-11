package com.liuww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * eureka 服务消费者主类
 * 使用 @EnableDiscoveryClient 注解将当前应用加入到服务治理体系中
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {

    /**
     * 初始化RestTemplate，用来真正发起REST请求
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }
}
