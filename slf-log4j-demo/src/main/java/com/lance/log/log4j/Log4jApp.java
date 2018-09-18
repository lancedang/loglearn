package com.lance.log.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 直接引用log4j接口
 */
public class Log4jApp {

    public final static Logger logger = LogManager.getLogger(Log4jApp.class);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        logger.info("info log4j");
        logger.error("error log4j");
        System.out.println("Hello World!");
    }
}
