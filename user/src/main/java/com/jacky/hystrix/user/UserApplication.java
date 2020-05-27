package com.jacky.hystrix.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableHystrix

/**
 * SpringCloudApplication
 * 提供了SpringBoot功能
 * 提供了自动注册到服务中心的功能
 * 开启了断路器
 */
@SpringCloudApplication
@EnableFeignClients(
        basePackages = {"com.jacky.hystrix.base"})
//@ComponentScan(basePackages = {"com.jacky.hystrix.user", "com.jacky.hystrix.base.client"})
public class UserApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
