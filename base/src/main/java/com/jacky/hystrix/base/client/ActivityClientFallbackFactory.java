//package com.jacky.hystrix.base.client;
//
//import feign.hystrix.FallbackFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// * @author chenjiaqi
// * @create 2020-05-27
// */
//public class ActivityClientFallbackFactory implements FallbackFactory<ActivityClient> {
//
//    private Logger logger = LoggerFactory.getLogger(ActivityClientFallbackFactory.class);
//
//    @Override
//    public ActivityClient create(Throwable throwable) {
////        logger.error("ActivityClient", throwable);
//
//        return new ActivityClient() {
//            @Override
//            public String firstLoginActivity(Long userId) {
//                return "fallbackFactory";
//            }
//
//            @Override
//            public String firstLoginActivityTimeout(Long userId) {
//                return "fallbackFactory";
//            }
//
//            @Override
//            public String firstLoginActivityError(Long userId) {
//                return "fallbackFactory";
//            }
//        };
//    }
//}
