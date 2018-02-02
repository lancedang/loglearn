package log.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogDemo.class);
        logger.info("log");
        System.out.println("log test");
    }
}
