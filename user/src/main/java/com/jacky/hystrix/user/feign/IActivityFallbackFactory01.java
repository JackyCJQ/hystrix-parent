//package com.jacky.hystrix.user.feign;
//
//import feign.hystrix.FallbackFactory;
//import org.springframework.stereotype.Component;
//
///**
// * 1、必须实现FallbackFactory接口
// * 2、需要提供一个被@FeignClient标注的接口的实现
// * 3、必须是一个spring bean
// *
// * @Authror jacky
// * @create 2020-05-24
// */
//@Component
//public class IActivityFallbackFactory01 implements FallbackFactory<IActivity> {
//    @Override
//    public IActivity create(Throwable throwable) {
//        System.out.println(throwable);
//        return new IActivity() {
//
//            @Override
//            public String firstLoginActivity(Long userId) {
//                return "fallbackFactory01";
//            }
//
//            @Override
//            public String firstLoginActivityTimeout(Long userId) {
//                return "fallbackFactory01";
//            }
//
//            @Override
//            public String firstLoginActivityError(Long userId) {
//                return "fallbackFactory01";
//            }
//        };
//    }
//}
