package com.liuww.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Trace2Controller
 *
 * @author liuww
 * @date 2018/10/29 09:52
 */
@RestController
public class Trace2Controller {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("trace-2")
    public String trace2() {
        logger.info("===controller in trace-2===");
        return "trace-2";
    }
}
