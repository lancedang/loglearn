package com.lance.log.customappender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 定义logback appender
 */
public class MapAppender extends AppenderBase<ILoggingEvent> {

    private ConcurrentHashMap<String, String> eventMap = new ConcurrentHashMap<>();

    //定义Appender属性，设置setter可在xml Appender中进行属性配置
    private String prefix;

    @Override
    protected void append(ILoggingEvent o) {
        eventMap.put(prefix + "-" + System.currentTimeMillis(), o.toString());
        System.out.println(prefix + "-" + System.currentTimeMillis() + ", " + o.toString());
    }


    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
