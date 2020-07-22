package com.boss.eurekaclientconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 黄杰峰
 * @Date 2020/7/22 0022 13:30
 * @Description
 *  name: 远程服务名，即"服务提供者"在注册中心中注册的名称
 */
@FeignClient(name = "provider")
public interface MyFeignClient {

    /**
     * @return
     * 服务提供者对应方法
     */
    @RequestMapping("/hello")
    public String hello();
}
