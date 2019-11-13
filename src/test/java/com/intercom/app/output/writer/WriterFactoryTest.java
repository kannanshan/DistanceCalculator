package com.intercom.app.output.writer;

import org.junit.Test;

import com.intercom.app.constants.AppConstants;

import org.junit.Assert;

public class WriterFactoryTest {

	@Test
	public void testInValidInput1() throws Exception {
		Assert.assertTrue(
				WriterFactory.getWriterObject(AppConstants.WRITER_TYPE.FILE.getWriterId()) instanceof FileWriter);
	}

	@Test
	public void testInValidInput2() throws Exception {
		Assert.assertTrue(WriterFactory
				.getWriterObject(AppConstants.WRITER_TYPE.COMMAND_LINE.getWriterId()) instanceof CommandLineWriter);
	}

	@Test
	public void testInValidInput3() throws Exception {
		Assert.assertNull(WriterFactory.getWriterObject(4));
	}

}
