package com.liuww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * 使用@EnableZipkinStreamServer注解来启动Zipkin Server支持消息中间件
 */
@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinRabbitmqServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinRabbitmqServerApplication.class, args);
    }
}
