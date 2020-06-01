package com.jacky.hystrix.springboot;

import com.jacky.hystrix.springboot.config.SecondInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
//		SpringApplication.run(SpringbootApplication.class, args);

        SpringApplication springApplication = new SpringApplication(SpringbootApplication.class);
        springApplication.addInitializers(new SecondInitializer());
        springApplication.run(args);
    }

}
