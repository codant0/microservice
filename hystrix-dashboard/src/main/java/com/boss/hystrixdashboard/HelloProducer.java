package com.boss.hystrixdashboard;

import com.boss.hystrixdashboard.controller.HelloProviderHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 黄杰峰
 * @Date 2020/7/23 0023 13:21
 * @Description
 */
@Primary
@FeignClient(name = "consul-provider", fallback = HelloProviderHystrix.class)
public interface HelloProducer {
    @RequestMapping("/hello")
    public String hello();
}
