package com.jacky.hystrix.springboot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
@Component
public abstract class AbstractEventMulticaster implements EventMulticaster {
    @Autowired
    private List<WeatherListener> listenerList;

    @Override
    public void multicastEvent(WeatherEvent weatherEvent) {
        doStart();
        listenerList.forEach(i -> i.onWeatherEvent(weatherEvent));
        doEnd();
    }

    @Override
    public void addListener(WeatherListener weatherListener) {
        listenerList.add(weatherListener);
    }

    @Override
    public void removeListener(WeatherListener weatherListener) {
        listenerList.remove(weatherListener);
    }

    protected abstract void doStart();

    protected abstract void doEnd();

}
