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
 * 通过application.yaml配置 该配置中的配置会优先于其他方式进行加载
 *
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Order(3)
public class ThirdInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        Map<String, Object> map = new HashMap<>();
        map.put("k3", "v3");
        MapPropertySource source = new MapPropertySource("ThirdInitializer", map);
        environment.getPropertySources().addLast(source);
        System.out.println("run  ThirdInitializer");
    }
}
