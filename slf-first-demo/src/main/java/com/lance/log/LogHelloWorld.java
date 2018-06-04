package com.lance.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * slf4j 最基础的入门使用, 先后在 pom 中加入日志实现框架, 对比打印日志结果
 */
public class LogHelloWorld {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogHelloWorld.class);

        logger.info("学习 slf4j");
        System.out.println("System out");
    }
}
