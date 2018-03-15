package com.epam.rp.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

/**
 * Useful for binary data (e.g. sending files to ReportPortal)
 *
 * @author Andrei Varabyeu
 */
public class LoggingUtils {

    private static final Logger LOGGER = LogManager.getLogger("binary_data_logger");

    private LoggingUtils() {
        //statics only
    }

    public static void log(File file, String message) {
        LOGGER.info("RP_MESSAGE#FILE#{}#{}", file.getAbsolutePath(), message);
    }
//
//    public static void log(byte[] bytes, String message) {
//        LOGGER.info("RP_MESSAGE#BASE64#{}#{}", BaseEncoding.base64().encode(bytes), message);
//    }

    public static void logBase64(String base64, String message) {
        LOGGER.info("RP_MESSAGE#BASE64#{}#{}", base64, message);
    }
}
