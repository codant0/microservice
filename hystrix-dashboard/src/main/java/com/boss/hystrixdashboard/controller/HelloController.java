package com.boss.hystrixdashboard.controller;

import com.boss.hystrixdashboard.HelloProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄杰峰
 * @Date 2020/7/23 0023 10:37
 * @Description
 */
@RestController
public class HelloController {

    private final HelloProducer producer;

    public HelloController(HelloProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/hello")
    public String hello() {
        return producer.hello();
    }
}
