package com.lance.log.util;

import com.lance.log.MainApp;

import static com.lance.log.MainApp.LOGGER;

/**
 * Created by Dangdang on 2018/6/7.
 */
public class LogTestUtil {
    public static void testLog() {
        LOGGER.trace("早上好");
        LOGGER.debug("今天感觉怎样");
        LOGGER.info("我挺好的");
        LOGGER.warn("我不喜欢编程");
        LOGGER.error("但我非得编");
    }
}
