package com.jacky.hystrix.base.client;

import com.jacky.hystrix.base.common.IActivity;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
@FeignClient(value = "activity-8090", fallbackFactory = ActivityClientFallbackFactory.class,
        configuration = ActivityConfiguration.class
)
public interface ActivityClient extends IActivity {
}