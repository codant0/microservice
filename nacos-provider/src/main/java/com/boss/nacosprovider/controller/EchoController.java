package com.boss.nacosprovider.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author 黄杰峰
 * @Date 2020/7/23 0023 16:13
 * @Description
 */
@RestController
public class EchoController {
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }
}
