package log.learn;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogDemoTest {

    Logger logger = LoggerFactory.getLogger(LogDemoTest.class);

    @Test
    public void test() {
        logger.info("junit test");
    }

}
