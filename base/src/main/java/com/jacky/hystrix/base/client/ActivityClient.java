package com.jacky.hystrix.base.client;

import com.jacky.hystrix.base.inter.IActivity;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
@FeignClient(value = "activity-8090", fallback = ActivityFallback.class,
        configuration = ActivityConfiguration.class
)
public interface ActivityClient extends IActivity {
}

class ActivityFallback implements ActivityClient {
    @Override
    public String firstLoginActivity(Long userId) {
        return "fallback";
    }

    @Override
    public String firstLoginActivityTimeout(Long userId) {
        return "fallback";
    }

    @Override
    public String firstLoginActivityError(Long userId) {
        return "fallback";
    }
}