package com.lance.log.log4j;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 通过Slf4j门面调用log4j
 */
public class Log4jApp2 {

    public final static Logger logger = LoggerFactory.getLogger(Log4jApp2.class);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        logger.info("info log4j");
        logger.error("error log4j");
        System.out.println("Hello World!");
    }
}
