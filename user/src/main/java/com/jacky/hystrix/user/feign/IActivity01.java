package com.jacky.hystrix.user.feign;//package com.jacky.hystrix.activity.feign;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
///**
// * @Authror jacky
// * @create 2020-05-24
// */
//@FeignClient(value = "activity-8099", fallbackFactory = IActivityFallbackFactory.class)
//public inter IActivity01 {
//    /**
//     * 用户正常注册
//     *
//     * @param userId
//     * @return
//     */
//    @PostMapping("/firstLoginActivity")
//    String firstLoginActivity(@RequestBody Long userId);
//
//    /**
//     * 模拟超时
//     *
//     * @param userId
//     * @return
//     */
//    @PostMapping("/firstLoginActivityTimeout")
//    String firstLoginActivityTimeout(@RequestBody Long userId);
//
//
//    /**
//     * 模拟超时
//     *
//     * @param userId
//     * @return
//     */
//    @PostMapping("/firstLoginActivityError")
//    String firstLoginActivityError(@RequestBody Long userId);
//}
