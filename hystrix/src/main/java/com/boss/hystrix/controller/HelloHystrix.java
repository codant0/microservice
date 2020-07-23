package com.boss.hystrix.controller;

import com.boss.hystrix.MyFeignClient;
import org.springframework.stereotype.Component;

/**
 * @Author 黄杰峰
 * @Date 2020/7/22 0022 21:04
 * @Description
 */
@Component
public class HelloHystrix implements MyFeignClient {
    @Override
    public String hello() {
        return "Error !";
    }
}
