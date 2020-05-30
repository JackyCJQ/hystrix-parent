package com.jacky.hystrix.user.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Authror jacky
 * @create 2020-05-23
 */
@Service
public class ActivityService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 调用活动服务 完成初次登陆 奖励发放
     *
     * @param id
     * @return
     */
    public String firstLogin(Long id) {
        return restTemplate.postForObject("http://activity-8090/firstLoginActivity", id, String.class);
    }

    /**
     * 模拟超时情况
     *
     * @param id
     * @return
     */
//    @HystrixCommand(
//            commandProperties = {
//                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
//            }
//    )
    public String firstLoginTimeout(Long id) {
        return restTemplate.postForObject("http://activity-8090/firstLoginActivityTimeout", id, String.class);
    }

    /**
     * 接口直接报错
     *
     * @param id
     * @return
     */
//    @HystrixCommand(
//            fallbackMethod = "fallback"
//    )
    public String firstLoginError(Long id) {
        return restTemplate.postForObject("http://activity-8090/firstLoginActivityError", id, String.class);
    }

    /**
     * 需要提供一个备用方案，当活动方案不可用得时候，执行备用方案
     *
     * @param id
     * @return
     */
    public String fallback(Long id) {
        return "降级方案";
    }
}
