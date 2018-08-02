package com.lance.log;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
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

        //打印 logback 内部状态信息，在未配置 logback.xml 时要编程实现，当配置了 配置文件后自动打印
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);


    }
}
