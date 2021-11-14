package com.falah.validator;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest {
    private static final Logger log = LoggerFactory.getLogger(LoggingTest.class);

    @Test
    void testLog() {
        System.out.println("Hello Logger");
        log.info("Hello Logger");
    }
}
