package com.darkgo.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {
    private static final Logger LOG = LoggerFactory.getLogger(LoggingApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoggingApplication.class, args);
        LOG.info("=========== info ==============");
        LOG.debug("=========== debug ==============");
        LOG.warn("=========== warn ==============");
        LOG.error("=========== error ==============");
    }

}
