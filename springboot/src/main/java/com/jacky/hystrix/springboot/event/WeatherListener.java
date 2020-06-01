package com.jacky.hystrix.springboot.event;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
public interface WeatherListener {
    public void onWeatherEvent(WeatherEvent event);
}
