package com.jacky.hystrix.springboot.controller;

import com.jacky.hystrix.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author chenjiaqi
 * @create 2020-05-30
 */
@RestController
@ConfigurationProperties(prefix = "test")
public class DemoController {
    //现在我们在配置文件写hello.msg=world,因为简单就不再展示;如果那么默认为default.还需要提供set方法才能从配置文件中设值过来
    private String msg = "default";

    @Autowired
    private TestService service;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @RequestMapping("/msg")
    public Object index() {
        return this.msg;
    }

    @RequestMapping("/test")
    public String test() {
        return Optional.ofNullable(service.test1()).orElse("error");
    }

    @RequestMapping("/test1")
    public String test1() {
        return Optional.of(service.test2()).orElse("error");
    }
}
