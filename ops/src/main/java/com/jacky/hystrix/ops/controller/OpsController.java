package com.jacky.hystrix.ops.controller;

import com.jacky.hystrix.base.common.IOps;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authror jacky
 * @create 2020-05-25
 */
@RestController
public class OpsController implements IOps {

    @Override
    public String ops(Long userId) {
        return userId + "";
    }
}
