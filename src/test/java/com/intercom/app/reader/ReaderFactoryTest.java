/**
 * @packageName : com.intercom.app.reader
 * @className : ReaderFactoryTest.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.reader;

import org.junit.Assert;
import org.junit.Test;

import com.intercom.app.constants.AppConstants;
import com.intercom.app.input.reader.CommandLineReader;
import com.intercom.app.input.reader.FileReader;
import com.intercom.app.input.reader.ReaderFactory;

public class ReaderFactoryTest {

	@Test
	public void testInValidInput1() throws Exception {
		Assert.assertTrue(
				ReaderFactory.getReaderObject(AppConstants.READER_TYPE.FILE.getReaderId()) instanceof FileReader);
	}

	@Test
	public void testInValidInput2() throws Exception {
		Assert.assertTrue(ReaderFactory
				.getReaderObject(AppConstants.READER_TYPE.COMMAND_LINE.getReaderId()) instanceof CommandLineReader);
	}

	@Test
	public void testInValidInput3() throws Exception {
		Assert.assertNull(ReaderFactory.getReaderObject(4));
	}
}
