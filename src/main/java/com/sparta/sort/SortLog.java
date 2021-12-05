package com.sparta.sort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortLog {
    private static Logger logger = LogManager.getLogger(SortLog.class);
    public static void log(String log)
    {
        logger.info(log);
    }

}

