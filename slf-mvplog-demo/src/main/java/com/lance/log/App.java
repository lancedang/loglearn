package com.lance.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("logger class: " + logger.getClass().getName());
        logger.info("hello");
        logger.warn("hello");
        logger.error("hello");
    }
}
