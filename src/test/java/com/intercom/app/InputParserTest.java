package com.intercom.app;

import org.junit.Test;
import org.junit.Assert;


import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.InputVO;

public class InputParserTest {

	protected void setUp() {

	}
	
	

	@Test
	public void testInputParserValidInput1() throws Exception {
		InputParser inputParser = new InputParser();
		String s = "-d 100 -s 53.339428 -6.257664";
		String[] args = null;
		args = s.split(" ");
		Assert.assertNotNull(inputParser.parseAndGetInputVO(args));
	}
	
	@Test
	public void testInputParserValidInput2() throws Exception {
		InputParser inputParser = new InputParser();
		String s = "-d 100 -s 53.339428 -6.257664 -w /tmp";
		String[] args = null;
		args = s.split(" ");
		Assert.assertNotNull(inputParser.parseAndGetInputVO(args));
	}
	
	@Test
	public void testInputParserValidInput3() throws Exception {
		InputParser inputParser = new InputParser();
		String s = "-d 100 -s 53.339428 -6.257664 -w /tmp -so asc";
		String[] args = null;
		args = s.split(" ");
		Assert.assertNotNull(inputParser.parseAndGetInputVO(args));
	}
	
	 @Test(expected = InvalidInputException.class)
	 public void testInputParserValidInput4() throws InvalidInputException {
			InputParser inputParser = new InputParser();
			String s = "-d -s 53.339428 -6.257664 -w /tmp -so asc";
			//String s =null;
			String[] args = null;
			args = s.split(" ");
			inputParser.parseAndGetInputVO(args);
		}
	 
	 @Test(expected = InvalidInputException.class)
	 public void testInputParserValidInput5() throws InvalidInputException {
			InputParser inputParser = new InputParser();
			String s = "-d -s 53.339428 ";
			//String s =null;
			String[] args = null;
			args = s.split(" ");
			inputParser.parseAndGetInputVO(args);
		}
	 
	 @Test(expected = InvalidInputException.class)
	 public void testInputParserValidInput6() throws InvalidInputException {
			InputParser inputParser = new InputParser();
			String s = "-d ";
			String[] args = null;
			args = s.split(" ");
			inputParser.parseAndGetInputVO(args);
		}
	 
	 @Test(expected = InvalidInputException.class)
	 public void testInputParserValidInput7() throws InvalidInputException {
			InputParser inputParser = new InputParser();
			String s = "-d 10 -s 190 200";
			String[] args = null;
			args = s.split(" ");
			inputParser.parseAndGetInputVO(args);
		}
	 
	 @Test(expected = InvalidInputException.class)
	 public void testValidateInput1() throws InvalidInputException
	 {
		 InputVO inputVO = new InputVO();
		 inputVO.setDistanceRange(2.3);
		 InputParser inputParser = new InputParser();
		 inputParser.validateInput(inputVO);
	 }
	 
	 @Test(expected = InvalidInputException.class)
	 public void testValidateInput2() throws InvalidInputException
	 {
		 InputVO inputVO = new InputVO();
		 inputVO.setSourceCoordinates(2.3, 1.3);
		 InputParser inputParser = new InputParser();
		 inputParser.validateInput(inputVO);
	 }
	 
	 
	 
	 @Test
	 public void testValidateInput3() throws InvalidInputException
	 {
		 InputVO inputVO = new InputVO();
		 inputVO.setSourceCoordinates(2.3, 1.3);
		 inputVO.setDistanceRange(2.3);
		 InputParser inputParser = new InputParser();
		 inputParser.validateInput(inputVO);
	 }

}
