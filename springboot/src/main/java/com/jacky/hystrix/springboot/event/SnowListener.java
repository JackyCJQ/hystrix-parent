package com.jacky.hystrix.springboot.event;

import org.springframework.stereotype.Component;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Component
public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent) {
            System.out.println("hello:" + event.getEvent());
        }
    }
}
