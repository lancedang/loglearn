package com.lance.log.springbootprofile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class MainApp {

    private static Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
        LOGGER.info("log test info");
        LOGGER.warn("log test warn");
        LOGGER.error("log test error");
    }
}
