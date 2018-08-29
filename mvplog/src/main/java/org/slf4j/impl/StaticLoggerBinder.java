package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

/**
 * Created by Dangdang on 2018/8/25.
 */
public class StaticLoggerBinder implements LoggerFactoryBinder {

    //定义单例
    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();

    //定义LoggerFactory
    private MvpLoggerFactory mvpLoggerFactory;

    private StaticLoggerBinder() {
        mvpLoggerFactory = new MvpLoggerFactory();
    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    @Override
    public ILoggerFactory getLoggerFactory() {
        return mvpLoggerFactory;
    }

    @Override
    public String getLoggerFactoryClassStr() {
        return null;
    }
}