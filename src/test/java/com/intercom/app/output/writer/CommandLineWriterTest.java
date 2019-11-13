/**
 * @packageName : com.intercom.app.output.writer
 * @className : CommandLineWriterTest.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.writer;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.intercom.app.vo.CustomerVO;

public class CommandLineWriterTest {

	@Test
	public void testInValidInput1() throws Exception {
		CommandLineWriter writer = new CommandLineWriter();
		writer.writeOutput("", null);
	}

	@Test
	public void testInValidInput2() throws Exception {
		CommandLineWriter writer = new CommandLineWriter();
		writer.writeOutput(new ArrayList(), null);
	}

	@Test
	public void testInValidInput3() throws Exception {
		CommandLineWriter writer = new CommandLineWriter();
		CustomerVO cust = new CustomerVO();
		List<CustomerVO> inputList = new ArrayList();
		inputList.add(cust);
		writer.writeOutput(inputList, null);
	}

}
