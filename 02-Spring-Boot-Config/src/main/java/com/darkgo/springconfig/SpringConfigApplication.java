package com.darkgo.springconfig;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({BlogBean.class})
public class SpringConfigApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringConfigApplication.class);
//        SpringApplication.run(SpringConfigApplication.class, args);
//        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

}
