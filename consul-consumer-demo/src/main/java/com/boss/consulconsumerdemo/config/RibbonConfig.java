package com.boss.consulconsumerdemo.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 黄杰峰
 * @Date 2020/7/22 0022 19:50
 * @Description Ribbon配置类
 */
@Configuration
@RibbonClient(name = "provider", configuration = RibbonClientConfiguration.class)
public class RibbonConfig {

    /**
     * 选择Ribbon的规则，此为随机。
     * 负载均衡策略：
     * Round Robin Rule - 线性轮询策略
     * Retry Rule - 重试策略
     * WeightedResponseTimeRule - 加权响应时间策略
     * RandomRule - 随机策略
     * ClientConfigEnabledRoundRobinRule - 客户端配置启用线性轮询策略
     * ......
     * 配置类与@Bean注解配合使用
     * @return
     */
    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}
