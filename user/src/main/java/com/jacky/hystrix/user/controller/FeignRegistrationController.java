//package com.jacky.hystrix.user.controller;
//
//import com.jacky.hystrix.base.client.ActivityClient;
//import com.jacky.hystrix.base.client.OpsClient;
//import com.jacky.hystrix.base.inter.IActivity;
//import com.jacky.hystrix.user.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @Authror jacky
// * @create 2020-05-24
// */
//@RestController
//@RequestMapping("/feign")
//public class FeignRegistrationController {
//    @Autowired
//    private ActivityClient service;
//    @Autowired
//    private OpsClient client;
////    @Autowired
////    private
////    @Autowired
////    private IActivity01 service01;
//
//    /**
//     * 用户注册
//     *
//     * @param user
//     * @return
//     */
//    @PostMapping("/userRegistration")
//    public String userRegistration(@RequestBody User user) {
//        System.out.println("用户的注册 成功：" + user.getName());
//        return service.firstLoginActivity(user.getId());
//    }
//
//    /**
//     * 用户注册
//     *
//     * @param activity
//     * @return
//     */
////    @PostMapping("/userRegistration01")
////    public String userRegistration01(@RequestBody User activity) {
////        System.out.println("用户的注册 成功：" + activity.getName());
////        return service01.firstLoginActivity(activity.getId());
////    }
//
//    /**
//     * 活动服务存在性能问题，响应时间过长
//     *
//     * @param user
//     * @return
//     */
//    @PostMapping("/userRegistrationTimeout")
//    public String userRegistrationTimeout(@RequestBody User user) {
//        System.out.println("用户的注册 成功：" + user.getName());
//        return service.firstLoginActivityTimeout(user.getId());
//    }
//
//    /**
//     * 活动服务存在性能问题，响应时间过长
//     *
//     * @param user
//     * @return
//     */
//    @PostMapping("/userRegistrationError")
//    public String userRegistrationError(@RequestBody User user) {
//        System.out.println("用户的注册 成功：" + user.getName());
//        return service.firstLoginActivityError(user.getId());
//    }
//}
