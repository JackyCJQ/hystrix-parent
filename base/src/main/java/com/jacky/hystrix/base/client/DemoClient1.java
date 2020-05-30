package com.jacky.hystrix.base.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjiaqi
 * @create 2020-05-28
 */
@FeignClient("activity-8091")
public interface DemoClient1 {
    @RequestMapping("/demo/demo")
    String demo();
}
