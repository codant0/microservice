package com.boss.eurekaclientconsumer.controller;

import com.boss.eurekaclientconsumer.client.MyFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄杰峰
 * @Date 2020/7/22 0022 13:34
 * @Description
 */
@RestController
public class ConsumerController {
    final
    MyFeignClient feignClient;

    public ConsumerController(MyFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @RequestMapping("/consumer")
    public String consumer() {
        return feignClient.hello();
    }
}
