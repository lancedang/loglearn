package log.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Dangdang on 2018/6/2.
 * slf4j log 级别和 {} 通配符的使用
 */
public class LogStarter1 {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("LogStarter1");

        //定义不同级别的日志，默认打印 info 及以上级别日志
        logger.debug("debug 级别");

        logger.info("info 级别");
        logger.warn("warn 级别");
        logger.error("error 级别");

        String name = "dangdang";
        Integer age = 20;

        //{} 通配符的使用
        logger.info("据说 {} 今年 {} 岁了", name, age);
    }
}
