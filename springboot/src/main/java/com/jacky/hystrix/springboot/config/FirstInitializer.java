package com.jacky.hystrix.springboot.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * ApplicationContextInitializer
 * 1、spring容器刷新之前回调的一个函数
 * 2、向springboot容器中注入属性
 * 3、继承接口自定义实现
 * <p>
 * 本配置通过配置spring.factories里添加配置，加入到容器中
 * <p>
 * Order越小越先执行
 *
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Order(1)
public class FirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        Map<String, Object> map = new HashMap<>();
        map.put("k1", "v1");
        MapPropertySource source = new MapPropertySource("firstInitializer", map);
        environment.getPropertySources().addLast(source);
        System.out.println("run  FirstInitializer");
    }
}
