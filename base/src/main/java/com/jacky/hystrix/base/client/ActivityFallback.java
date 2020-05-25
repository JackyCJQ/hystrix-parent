package com.jacky.hystrix.base.client;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
public class ActivityFallback implements ActivityClient {
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
