package com.lance.log.customappender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        LOGGER.info("log test info");
        LOGGER.warn("log test warn");
        LOGGER.error("log test error");
    }
}
