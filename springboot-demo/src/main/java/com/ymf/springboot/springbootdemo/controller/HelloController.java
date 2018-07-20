package com.ymf.springboot.springbootdemo.controller;

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

    @RequestMapping(value = "sayhello", method = RequestMethod.GET)
    public String hello() {
        return "Hello springboot4";
    }
}
