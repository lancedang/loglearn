package com.lance.log.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public class Log4jApp {

    public final static Logger logger = LogManager.getLogger(Log4jApp.class);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        logger.info("info log4j2");
        logger.error("error log4j2");
        System.out.println("Hello World!");
    }
}
