package com.jacky.hystrix.user.hystrix;

import com.jacky.hystrix.base.client.ActivityClient;
import com.netflix.hystrix.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chenjiaqi
 * @create 2020-05-28
 */
@Slf4j
public class QueryOrderIdCommand extends HystrixCommand<String> {

    private ActivityClient activityClient;

    protected QueryOrderIdCommand(ActivityClient activityClient) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("orderService"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("queryByOrderId"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter().withCircuitBreakerRequestVolumeThreshold(10)
                        .withCircuitBreakerSleepWindowInMilliseconds(5000).withCircuitBreakerErrorThresholdPercentage(50).withExecutionTimeoutEnabled(true))
                .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withCoreSize(10)));
        this.activityClient = activityClient;
    }

    @Override
    protected String run() throws Exception {
        return activityClient.firstLoginActivity(1L);
    }

    @Override
    protected String getFallback() {
        return "new fallback";
    }
}
