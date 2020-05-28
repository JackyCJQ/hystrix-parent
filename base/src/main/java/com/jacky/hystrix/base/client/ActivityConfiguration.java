package com.jacky.hystrix.base.client;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
//@Component
public class ActivityConfiguration {
    @Bean
    public ActivityClient getFallback() {
        return new ActivityFallback();
    }
//
//    public OpsClient getOpsClient() {
//        return new OpsClientFallback();
//    }

    @Bean
    public ActivityClientFallbackFactory fallbackFactoyr() {
        return new ActivityClientFallbackFactory();
    }
}
