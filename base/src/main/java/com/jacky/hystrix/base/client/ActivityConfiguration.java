package com.jacky.hystrix.base.client;

import org.springframework.context.annotation.Bean;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
//@Configuration
public class ActivityConfiguration {
//    @Bean
//    public ActivityClient getFallback() {
//        return new ActivityFallback();
//    }
//
//    public OpsClient getOpsClient() {
//        return new OpsClientFallback();
//    }

    @Bean
    public ActivityClientFallbackFactoyr fallbackFactoyr() {
        return new ActivityClientFallbackFactoyr();
    }
}
