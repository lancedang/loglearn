package com.lance.log.customappender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.concurrent.TimeUnit.SECONDS;

public class MainApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws InterruptedException {

        try {
            ManualAppenderFactory.createRollingFileAppender();
        } catch (Exception e) {
            //若自动创建失败不做任何处理
            //Cat.logError("create fileAppender fail", e);
            e.printStackTrace();
        }
        while (true) {
            LOGGER.info("log test info");
            LOGGER.warn("log test warn");
            LOGGER.error("log test error");
            //SECONDS.sleep(2);
            Thread.sleep(50);
        }
    }
}
