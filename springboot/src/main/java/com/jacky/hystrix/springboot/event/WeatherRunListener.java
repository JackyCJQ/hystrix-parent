package com.jacky.hystrix.springboot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Component
public class WeatherRunListener {

    @Autowired
    private WeatherEventMulticaster multicaster;

    public void snow() {
        multicaster.multicastEvent(new SnowEvent());
    }

    public void rain() {
        multicaster.multicastEvent(new RainEvent());
    }
}
