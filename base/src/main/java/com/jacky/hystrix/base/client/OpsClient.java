package com.jacky.hystrix.base.client;

import com.jacky.hystrix.base.inter.IOps;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
@FeignClient(value = "ops-8100", fallback = OpsClientFallback.class
//        configuration = OpsConfiguration.class)
)
public interface OpsClient extends IOps {

}
