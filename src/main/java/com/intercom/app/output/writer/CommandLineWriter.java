/**
 * @packageName : com.intercom.test.output
 * @className : CommandLineWriter.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.writer;

import java.util.List;

import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.CustomerVO;
import com.intercom.app.vo.InputVO;

public class CommandLineWriter extends Writer {

	/**
	 * 
	 * @param outputList
	 * @param inputVO
	 * @throws Exception
	 */
	@Override
	public void writeOutput(List<CustomerVO> outputList, InputVO inputVO) throws InvalidInputException{
		if (outputList.size() != 0) {
			System.out.println("Please find the output below:");
			for (CustomerVO customerVO : outputList) {
				System.out.println(customerVO.toString());
			}
		} else {
			System.out.println("No Customers are found with the given range");
		}

	}

	/**
	 * 
	 * @param message
	 * @param inputVO
	 * @throws Exception
	 */
	@Override
	public void writeOutput(String message, InputVO inputVO) throws InvalidInputException{
		System.out.println(message);

	}

}
