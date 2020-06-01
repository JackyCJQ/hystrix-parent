package com.jacky.hystrix.springboot.event;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
public class Test {
    public static void main(String[] args) {
        WeatherEventMulticaster multicaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        multicaster.addListener(rainListener);
        multicaster.addListener(snowListener);
        multicaster.multicastEvent(new SnowEvent());
        multicaster.multicastEvent(new RainEvent());
        multicaster.removeListener(rainListener);
        multicaster.multicastEvent(new SnowEvent());
        multicaster.multicastEvent(new RainEvent());
    }
}
