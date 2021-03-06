package com.lance.log;

import com.lance.log.log4j.Log4jApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class MainApp {

    public static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            LOGGER.trace("Hello World!");
            LOGGER.debug("How are you today?");
            LOGGER.info("I am fine.");
            LOGGER.warn("I love programming.");
            LOGGER.error("I am programming.");

            //打印 logback 内部状态信息，在未配置 logback.xml 时要编程实现，当配置了 配置文件后自动打印
/*        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);*/
            //Log4jApp.test();
            Thread.sleep(10000);
        }
    }
}
