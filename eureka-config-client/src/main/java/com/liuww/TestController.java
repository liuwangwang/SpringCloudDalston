package com.liuww;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @RefreshScope 注解，用于配置文件更新时处理
 *
 * @author liuww
 * @date 2018/10/22 16:01
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${test}")
    private String test;

    @GetMapping("test")
    public String test() {
        return this.test;
    }
}
