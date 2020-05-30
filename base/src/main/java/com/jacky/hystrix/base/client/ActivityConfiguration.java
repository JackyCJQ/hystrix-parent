package com.jacky.hystrix.base.client;

import org.springframework.context.annotation.Bean;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
public class ActivityConfiguration {
    @Bean
    public ActivityClient getFallback() {
        return new ActivityFallback();
    }

    @Bean
    public ActivityClientFallbackFactory fallbackFactoyr() {
        return new ActivityClientFallbackFactory();
    }
}
