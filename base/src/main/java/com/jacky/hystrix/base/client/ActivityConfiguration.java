package com.jacky.hystrix.base.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
//@Configuration
public class ActivityConfiguration {
    @Bean
    public ActivityClient getFallback() {
        return new ActivityFallback();
    }

//    public OpsClient getOpsClient() {
//        return new OpsClientFallback();
//    }
}
