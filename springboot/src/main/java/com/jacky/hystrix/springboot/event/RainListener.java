package com.jacky.hystrix.springboot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Component
public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println("hello:" + event.getEvent());
        }
    }
}
