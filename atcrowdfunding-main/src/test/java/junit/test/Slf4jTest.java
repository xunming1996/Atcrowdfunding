package junit.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {
	
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Slf4jTest.class);
		
		logger.debug("debug级别的日志");
		logger.info("info 级别的日志");
		logger.warn("warn级别的日志");
		logger.error("error级别的日志");
	}

}
