package com.epam.rp.tests.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * JUST an example of file logging
 *
 * @author Andrei Varabyeu
 */
public class XmlLoggingTest {

	private static final Logger LOGGER = LogManager.getLogger(XmlLoggingTest.class);
	public static final String XML_FILE_PATH = "xml/file.xml";

//	@Test
//	public void logXmlBase64() throws IOException {
//		/* here we are logging some binary data as BASE64 string */
//		LOGGER.info("RP_MESSAGE#BASE64#{}#{}",
//				BaseEncoding.base64().encode(Resources.asByteSource(Resources.getResource(XML_FILE_PATH)).read()),
//				"I'm logging content via BASE64");
//	}
//
//	@Test
//	public void logXmlFile() throws IOException {
//		/* here we are logging some binary data as file (useful for selenium) */
//		File file = File.createTempFile("rp-test", "xml");
//		Resources.asByteSource(Resources.getResource(XML_FILE_PATH)).copyTo(Files.asByteSink(file));
//
//		LOGGER.info("RP_MESSAGE#FILE#{}#{}", file.getAbsolutePath(), "I'm logging content via temp file");
//	}
}
