package com.amazon.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerUtil {
    public static Logger logger;

    public static void initLogger() {
        logger = LogManager.getLogger("TestLogger");
    }
}