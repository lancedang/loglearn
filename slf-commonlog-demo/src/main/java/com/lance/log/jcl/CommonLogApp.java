package com.lance.log.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 */
public class CommonLogApp {

    public static Log log = LogFactory.getLog(CommonLogApp.class);

    public static void main(String[] args) {
        log.info(log.getClass().getName());
        log.debug("common log debug");
        log.info("common log info");
        log.warn("common log warn");
        log.error("common log error");
    }
}
