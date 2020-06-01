package com.jacky.hystrix.springboot.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Service
public class TestService implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public String test1() {
        return context.getEnvironment().getProperty("k3");
    }

    public String test2() {
        return context.getEnvironment().getProperty("k2");
    }
}
