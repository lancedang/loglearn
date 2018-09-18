package com.lance.log.learn;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertTrue;

/**
 */
public class JoranConfigurationTest {

    @Test
    public void test() throws JoranException {

        LoggerContext loggerContext = new LoggerContext();
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(loggerContext);

        //清空先前配置
        loggerContext.reset();

        //获取自定义配置文件
        InputStream inputStream = this.getClass().getResourceAsStream("/custorm.xml");

        //配置自定义文件
        joranConfigurator.doConfigure(inputStream);

        Logger logger = loggerContext.getLogger(JoranConfigurationTest.class);

        logger.info("hello" );

    }
}
