package com.liuww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用@EnableTurbine注解开启Turbine
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZipkinRabbitmqTrace2Application {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinRabbitmqTrace2Application.class, args);
    }
}
