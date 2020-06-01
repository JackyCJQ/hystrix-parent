package com.jacky.hystrix.springboot;

import com.jacky.hystrix.springboot.event.WeatherRunListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private WeatherRunListener listener;

    @Test
    public void test() {

    }

    @Test
    void contextLoads() {
        listener.rain();
        listener.snow();
    }

}
