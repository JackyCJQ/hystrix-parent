package com.jacky.hystrix.activity.controller;

import com.jacky.hystrix.base.inter.IActivity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 处理注册、登陆相关活动
 *
 * @Authror jacky
 * @create 2020-05-23
 */
@RestController
public class LoginActivityController implements IActivity {
    /**
     * 用户正常注册
     *
     * @param userId
     * @return
     */
    @Override
    public String firstLoginActivity(@RequestBody Long userId) {
        System.out.println("LoginActivityController 为首次登陆（注册）用户发放优惠券成功" + userId);
        return "success";
    }

    /**
     * 模拟超时
     *
     * @param userId
     * @return
     */
    @Override
    public String firstLoginActivityTimeout(@RequestBody Long userId) {
        try {
//            TimeUnit.SECONDS.sleep(RandomUtils.nextInt(5) + 1);
            TimeUnit.SECONDS.sleep(2 + 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("LoginActivityController 为首次登陆（注册）用户发放优惠券成功" + userId);
        return "success";
    }

    /**
     * 模拟出错
     *
     * @param userId
     * @return
     */
    @Override
    public String firstLoginActivityError(@RequestBody Long userId) {
        throw new RuntimeException("LoginActivityController 为首次登陆，用户发放优惠券失败" + userId);
//        return "success";
    }


}
