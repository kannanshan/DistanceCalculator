/**
 * @packageName : com.intercom.app.output.writer
 * @className : FileWriterTest.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.writer;

import org.junit.Test;

import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.CustomerVO;
import com.intercom.app.vo.InputVO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class FileWriterTest {

	@Test
	public void testWriteOutput1() throws IOException, InvalidInputException {
		FileWriter writer = new FileWriter();
		InputVO inputVO = new InputVO();
		writer.writeOutput("", inputVO);
	}

	@Test(expected = InvalidInputException.class)
	public void testWriteOutput2() throws IOException, InvalidInputException {
		FileWriter writer = new FileWriter();
		InputVO inputVO = new InputVO();
		inputVO.setWorkingDirectory("/");
		writer.writeOutput("", inputVO);
	}

	@Test
	public void testWriteOutput3() throws IOException, InvalidInputException {
		FileWriter writer = new FileWriter();
		InputVO inputVO = new InputVO();
		List<CustomerVO> outputList = new ArrayList();
		CustomerVO customer = new CustomerVO();
		outputList.add(customer);
		writer.writeOutput(outputList, inputVO);
	}

	@Test(expected = InvalidInputException.class)
	public void testWriteOutput4() throws IOException, InvalidInputException {
		FileWriter writer = new FileWriter();
		InputVO inputVO = new InputVO();
		inputVO.setWorkingDirectory("/");
		List<CustomerVO> outputList = new ArrayList();
		CustomerVO customer = new CustomerVO();
		outputList.add(customer);
		writer.writeOutput(outputList, inputVO);
	}

}
