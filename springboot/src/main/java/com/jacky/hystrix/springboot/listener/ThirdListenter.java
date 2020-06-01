package com.jacky.hystrix.springboot.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Order(4)
public class ThirdListenter implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return ApplicationStartedEvent.class.isAssignableFrom(aClass);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("hello third");
    }
}