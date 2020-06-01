package com.jacky.hystrix.springboot.event;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
public class RainEvent extends WeatherEvent {
    @Override
    public String getEvent() {
        return "rain";
    }
}
