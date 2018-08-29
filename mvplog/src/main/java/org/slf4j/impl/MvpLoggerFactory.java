package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 * Created by Dangdang on 2018/8/25.
 */
public class MvpLoggerFactory implements ILoggerFactory {

    private MvpLogger mvpLogger = new MvpLogger();

    @Override
    public Logger getLogger(String s) {
        return mvpLogger;
    }
}
