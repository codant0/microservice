package com.boss.hystrix.controller;

import com.boss.hystrix.MyFeignClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄杰峰
 * @Date 2020/7/23 0023 8:54
 * @Description
 */
@RestController
public class HelloController {

    private Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    private final MyFeignClient feignClient;

    public HelloController(MyFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @RequestMapping("/hello")
    public String hello() {
        logger.info("ERROR!");
        return feignClient.hello();
    }
}
