package com.jacky.hystrix.ops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author chenjiaqi
 * @create 2020-05-28
 */
@RestController
public class Demo {
    @RequestMapping("/demo/demo")
    public String demo() {
        return "ops";
    }

    @RequestMapping("/timeout")
    public String timeout() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
