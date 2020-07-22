package com.boss.consulserverdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author 黄杰峰
 * @Date 2020/7/22 0022 17:22
 * @Description
 */
@RestController
public class HelloController {

    @Value("${provider.name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String sayHello() {
        String str = "name: " + name + ",  port: " + port;
        return str;
    }
}
