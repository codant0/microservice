package com.boss.hystrixdashboard.controller;

import com.boss.hystrixdashboard.HelloProducer;
import org.springframework.stereotype.Component;

/**
 * @Author 黄杰峰
 * @Date 2020/7/23 0023 13:22
 * @Description
 */
@Component
public class HelloProviderHystrix implements HelloProducer {
    @Override
    public String hello() {
        return "Error!";
    }
}
