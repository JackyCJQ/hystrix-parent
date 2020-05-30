package com.jacky.hystrix.base.client;

import org.springframework.stereotype.Component;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
@Component
public class OpsClientFallback implements OpsClient {
    @Override
    public String ops(Long userId) {
        return "fallback";
    }
}
