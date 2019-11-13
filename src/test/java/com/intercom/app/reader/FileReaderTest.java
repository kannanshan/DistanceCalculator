/**
 * @packageName : com.intercom.app.reader
 * @className : FileReaderTest.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.reader;

import org.junit.Test;

import java.io.IOException;

import org.junit.Assert;


import com.intercom.app.common.InvalidInputException;
import com.intercom.app.input.reader.FileReader;
import com.intercom.app.vo.InputVO;

public class FileReaderTest{
	
	@Test(expected = InvalidInputException.class)
	 public void testReadInput1() throws InvalidInputException,IOException {
		InputVO inputVO = new InputVO();
		inputVO.setWorkingDirectory("/");
		FileReader reader = new FileReader();
		reader.readInput(inputVO);
	}
	
	@Test
	 public void testReadInput2() throws InvalidInputException,IOException {
		InputVO inputVO = new InputVO();
		inputVO.setWorkingDirectory("");
		FileReader reader = new FileReader();
		reader.readInput(inputVO);
	}
	
	@Test
	 public void testReadInput3() throws InvalidInputException,IOException {
		InputVO inputVO = new InputVO();
		inputVO.setWorkingDirectory("");
		FileReader reader = new FileReader();
		Assert.assertEquals(reader.readInput(inputVO).size(),32);
	}

}
