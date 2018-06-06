package com.lance.log;

import com.lance.log.util.LogTestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class MainApp {

    public static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        LOGGER.trace("Hello World!");
        LOGGER.debug("How are you today?");
        LOGGER.info("I am fine.");
        LOGGER.warn("I love programming.");
        LOGGER.error("I am programming.");

        LogTestUtil.testLog();

    }
}
