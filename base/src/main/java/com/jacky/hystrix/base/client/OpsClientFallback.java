package com.jacky.hystrix.base.client;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
public class OpsClientFallback implements OpsClient {
    @Override
    public String ops(Long userId) {
        return "fallback";
    }
}
