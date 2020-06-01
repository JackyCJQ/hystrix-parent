package com.jacky.hystrix.springboot.event;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
public interface EventMulticaster {
    void multicastEvent(WeatherEvent weatherEvent);

    void addListener(WeatherListener weatherListener);

    void removeListener(WeatherListener weatherListener);

}
