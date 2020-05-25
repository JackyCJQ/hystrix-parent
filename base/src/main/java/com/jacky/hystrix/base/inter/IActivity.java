package com.jacky.hystrix.base.inter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * 公共组件
 *
 * @Authror jacky
 * @create 2020-05-25
 */
public interface IActivity {


    /**
     * 用户正常注册
     *
     * @param userId
     * @return
     */
    @PostMapping("/firstLoginActivity")
    String firstLoginActivity(@RequestBody Long userId);

    /**
     * 模拟超时
     *
     * @param userId
     * @return
     */
    @PostMapping("/firstLoginActivityTimeout")
    String firstLoginActivityTimeout(@RequestBody Long userId);

    /**
     * 模拟超时
     *
     * @param userId
     * @return
     */
    @PostMapping("/firstLoginActivityError")
    String firstLoginActivityError(@RequestBody Long userId);
}
