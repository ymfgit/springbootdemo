package com.ymf.springboot.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 姚美发
 * @name
 * @desc
 * @jdk 1.8
 * @group
 * @os win10
 * @date 2018/7/20
 */

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "sayhello", method = RequestMethod.GET)
    public String hello() {
        logger.info("hello world");
        return "Hello springboot4";
    }
}

