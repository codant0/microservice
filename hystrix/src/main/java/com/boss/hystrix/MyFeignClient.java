package com.boss.hystrix;

import com.boss.hystrix.controller.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 黄杰峰
 * @Date 2020/7/22 0022 20:57
 * @Description
 */
@Primary
@FeignClient(name = "consul-provider", fallback = HelloHystrix.class)
public interface MyFeignClient {

    /**
     * Feign调用接口
     * @return
     */
    @RequestMapping("/hello")
    public String hello();
}
