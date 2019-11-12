/**
 * @packageName : com.intercom.test.output
 * @className : FileWriter.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.writer;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.CustomerVO;
import com.intercom.app.vo.InputVO;

public class FileWriter extends Writer {

	/**
	 * 
	 * @param outputList
	 * @param inputVO
	 * @throws Exception
	 */
	@Override
	public void writeOutput(List<CustomerVO> outputList, InputVO inputVO) throws InvalidInputException, IOException {
		BufferedWriter writer = null;
		if (outputList.size() != 0) {
			try {
				writer = new BufferedWriter(new java.io.FileWriter(inputVO.getWorkingDirectory() + "output.txt"));
				for (CustomerVO customerVO : outputList) {
					writer.write(customerVO.toString());
					writer.newLine();
				}
			} catch (FileNotFoundException e) {
				throw new InvalidInputException(
						"Output file not found. Please check the working directory value is proper");
			} finally {
				if (writer != null)
					writer.close();
			}
		} else {
			writeOutput("No Customers are found within the given range", inputVO);
		}

	}

	/**
	 * 
	 * @param message
	 * @param inputVO
	 * @throws Exception
	 */
	@Override
	public void writeOutput(String message, InputVO inputVO) throws InvalidInputException, IOException {
		if (message != null) {
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new java.io.FileWriter(inputVO.getWorkingDirectory() + "output.txt"));
				writer.write(message);
				writer.newLine();
				writer.close();
			} finally {
				writer.close();
			}
		}

	}

}
