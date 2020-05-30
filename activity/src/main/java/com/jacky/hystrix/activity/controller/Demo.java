package com.jacky.hystrix.activity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjiaqi
 * @create 2020-05-28
 */
@RestController
public class Demo {
    @RequestMapping("/demo/demo")
    public String demo() {
        return "activity";
    }
}
