package com.jacky.hystrix.base.common;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
public interface IOps {
    /**
     * 用户计价
     *
     * @param userId
     * @return
     */
    @PostMapping("/ops")
    String ops(@RequestBody Long userId);
}
