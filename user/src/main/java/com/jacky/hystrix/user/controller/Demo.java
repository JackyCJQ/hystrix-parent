package com.jacky.hystrix.user.controller;

import com.jacky.hystrix.base.client.DemoClient1;
import com.jacky.hystrix.base.client.DemoClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author chenjiaqi
 * @create 2020-05-28
 */
@RestController
public class Demo {

    @Autowired
    private DemoClient1 demoClient1;

    @Autowired
    private DemoClient2 demoClient2;

    @RequestMapping("/activity")
    public String demo() {
        return demoClient1.demo();
    }

    @RequestMapping("/ops")
    public String demo1() {
        return demoClient2.demo();
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
