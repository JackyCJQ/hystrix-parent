package com.jacky.hystrix.user.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Authror jacky
 * @create 2020-05-24
 */
@Service
public class ActivityServiceBulkhead {
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
    @HystrixCommand(
            threadPoolKey = "firstLoginTimeout",
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "1"),
                    @HystrixProperty(name = "maxQueueSize", value = "1")
            },
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
            }
    )
    public String firstLoginTimeout(Long id) {
        return restTemplate.postForObject("http://activity-8090/firstLoginActivityTimeout", id, String.class);
    }

    /**
     * 接口直接报错
     *
     * @param id
     * @return
     */
    @HystrixCommand(
            fallbackMethod = "fallback",
            threadPoolKey = "firstLoginError",
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "2"),
                    @HystrixProperty(name = "maxQueueSize", value = "5")
            }
    )
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

    /**
     * 断路器打开
     * <p>
     * 3秒钟内，请求次数达到2个，并且失败率在50%以上，就跳闸
     * 跳闸后的活动窗口设置为3秒
     *
     * @param id
     * @return
     */
    @HystrixCommand(
            commandProperties = {
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "3000"),
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2"),
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "3000"),
            }
    )
    public String userRegistrationCircuitOpen(Long id) {
        return restTemplate.postForObject("http://activity-8090/firstLoginActivityError", id, String.class);
    }
}
