package com.jacky.hystrix.springboot.event;

import org.springframework.stereotype.Component;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster {
    @Override
    protected void doStart() {
        System.out.println("begin broadcast weather event");
    }

    @Override
    protected void doEnd() {
        System.out.println("end broadcast weather event");

    }
}
