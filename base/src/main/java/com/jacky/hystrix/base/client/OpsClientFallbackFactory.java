package com.jacky.hystrix.base.client;

import feign.hystrix.FallbackFactory;

/**
 * @author chenjiaqi
 * @create 2020-05-30
 */
public class OpsClientFallbackFactory implements FallbackFactory<OpsClient> {
    @Override
    public OpsClient create(Throwable throwable) {
        return new OpsClient() {
            @Override
            public String ops(Long userId) {
                return "fallbackFactory";
            }
        };
    }
}
