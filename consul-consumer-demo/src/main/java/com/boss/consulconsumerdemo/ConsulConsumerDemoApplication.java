package com.boss.consulconsumerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsulConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerDemoApplication.class, args);
    }

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() { return new RestTemplate(); }
}
