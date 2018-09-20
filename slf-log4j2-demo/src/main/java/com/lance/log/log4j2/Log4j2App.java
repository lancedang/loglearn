package com.lance.log.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 直接引用log4j接口
 */
public class Log4j2App {

    public final static Logger logger = LogManager.getLogger(Log4j2App.class);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        logger.info("info log4j2");
        logger.error("error log4j2");
        System.out.println("Hello World!");
    }
}
