package com.lance.log.customappender;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP;
import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;
import ch.qos.logback.core.util.FileSize;
import org.slf4j.LoggerFactory;


public class ManualAppenderFactory {

    protected static final String LOG_DIR = "/www/framework/logs";
    protected static final String LOG_FILE_NAME = "logclient.log";
    protected static final String DATE_PATTERN_WITH_SECONDS = LOG_DIR + "/" + LOG_FILE_NAME + ".%d{yyyy-MM-dd}.%i";


    public static void createFileAppender(String string, String file) {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        PatternLayoutEncoder ple = new PatternLayoutEncoder();

        ple.setPattern("%date %level [%thread] %logger{10} [%file:%line] %msg%n");
        ple.setContext(lc);
        ple.start();

        FileAppender<ILoggingEvent> fileAppender = new FileAppender<ILoggingEvent>();
        fileAppender.setFile(file);
        fileAppender.setEncoder(ple);
        fileAppender.setContext(lc);
        fileAppender.start();

        Logger logger = (Logger) LoggerFactory.getLogger(string);
        logger.addAppender(fileAppender);
        logger.setLevel(Level.INFO);
        logger.setAdditive(false); /* set to true if root should log too */

        //return logger;
    }

    public static void createRollingFileAppender() {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        PatternLayoutEncoder ple = new PatternLayoutEncoder();

        ple.setPattern("%date %level [%thread] %logger{10} [%file:%line] %msg%n");
        ple.setContext(lc);
        ple.start();

        //rollingPolicy
        SizeAndTimeBasedRollingPolicy rollingPolicy = new SizeAndTimeBasedRollingPolicy<Object>();

        //组装RollingPolicy
        rollingPolicy.setFileNamePattern(DATE_PATTERN_WITH_SECONDS);
        rollingPolicy.setMaxHistory(5);
        rollingPolicy.setMaxFileSize(FileSize.valueOf("10KB"));

        rollingPolicy.setContext(lc);
        rollingPolicy.setTotalSizeCap (FileSize.valueOf("10GB"));

        //最后组装RollingFileAppender
        RollingFileAppender<ILoggingEvent> fileAppender = new RollingFileAppender<ILoggingEvent>();
        fileAppender.setName("rolling");
        fileAppender.setFile(LOG_DIR + "/" + LOG_FILE_NAME);
        fileAppender.setEncoder(ple);
        fileAppender.setRollingPolicy(rollingPolicy);

        rollingPolicy.setParent(fileAppender);

        rollingPolicy.start();
        fileAppender.setContext(lc);
        fileAppender.start();

        Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.addAppender(fileAppender);
        logger.setLevel(Level.INFO);

    }

    private void initPolicies(RollingFileAppender<Object> rfa, TimeBasedRollingPolicy<Object> tbrp, String filenamePattern, int sizeThreshold,
                              ContextBase context) {
        SizeAndTimeBasedFNATP sizeAndTimeBasedFNATP = new SizeAndTimeBasedFNATP<Object>();
        tbrp.setContext(context);
        sizeAndTimeBasedFNATP.setMaxFileSize(new FileSize(sizeThreshold));
        tbrp.setTimeBasedFileNamingAndTriggeringPolicy(sizeAndTimeBasedFNATP);
        tbrp.setFileNamePattern(filenamePattern);
        tbrp.setParent(rfa);
        //tbrp.timeBasedFileNamingAndTriggeringPolicy.setCurrentTime(givenTime);
        rfa.setRollingPolicy(tbrp);
        tbrp.start();
        rfa.start();
    }

}
