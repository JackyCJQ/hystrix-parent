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
 * 手动添加到容器中
 *
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Order(2)
public class SecondInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        Map<String, Object> map = new HashMap<>();
        map.put("k2", "v2");
        MapPropertySource source = new MapPropertySource("SecondInitializer", map);
        environment.getPropertySources().addLast(source);
        System.out.println("run  SecondInitializer");
    }
}
