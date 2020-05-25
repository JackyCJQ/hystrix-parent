package com.jacky.hystrix.user.controller;

import com.jacky.hystrix.user.entity.User;
import com.jacky.hystrix.user.service.ActivityServiceBulkhead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户注册相关
 *
 * @Authror jacky
 * @create 2020-05-23
 */
@RestController
public class RegistrationController {

    @Autowired
//    private ActivityService service;
    private ActivityServiceBulkhead service;

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @PostMapping("/userRegistration")
    public String userRegistration(@RequestBody User user) {
        System.out.println("用户的注册 成功：" + user.getName());
        return service.firstLogin(user.getId());
    }

    /**
     * 活动服务存在性能问题，响应时间过长
     *
     * @param user
     * @return
     */
    @PostMapping("/userRegistrationTimeout")
    public String userRegistrationTimeout(@RequestBody User user) {
        System.out.println("用户的注册 成功：" + user.getName());
        return service.firstLoginTimeout(user.getId());
    }

    /**
     * 活动服务存在性能问题，响应时间过长
     *
     * @param user
     * @return
     */
    @PostMapping("/userRegistrationError")
    public String userRegistrationError(@RequestBody User user) {
        System.out.println("用户的注册 成功：" + user.getName());
        return service.firstLoginError(user.getId());
    }

    /**
     * 活动服务存在性能问题，响应时间过长
     *
     * @param user
     * @return
     */
    @PostMapping("/userRegistrationCircuitOpen")
    public String userRegistrationCircuitOpen(@RequestBody User user) {
        System.out.println("用户的注册 成功：" + user.getName());
        return service.userRegistrationCircuitOpen(user.getId());
    }
}
