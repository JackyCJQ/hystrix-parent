package com.jacky.hystrix.base.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjiaqi
 * @create 2020-05-28
 */
@FeignClient("ops-8100")
public interface DemoClient2 {
    @RequestMapping("/demo/demo")
    String demo();
}
