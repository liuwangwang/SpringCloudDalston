package com.liuww.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Trace1Controller
 *
 * @author liuww
 * @date 2018/10/26 18:37
 */
@RestController
public class Trace1Controller {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("trace-1")
    public String trace() {
        logger.info("===controller in trace-1===");
        return restTemplate.getForEntity("http://zipkin-rabbitmq-trace-2/trace-2", String.class).getBody();
    }
}
