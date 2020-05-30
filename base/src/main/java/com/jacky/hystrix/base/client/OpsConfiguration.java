package com.jacky.hystrix.base.client;

import org.springframework.context.annotation.Bean;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
public class OpsConfiguration {
    @Bean
    public OpsClient getOpsClient() {
        return new OpsClientFallback();
    }

    @Bean
    public OpsClientFallbackFactory getFallbackFactory() {
        return new OpsClientFallbackFactory();
    }
}
