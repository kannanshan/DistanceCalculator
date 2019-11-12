/**
 * @packageName : com.intercom.test.input
 * @className : FileReader.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.input.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.CustomerVO;
import com.intercom.app.vo.InputVO;

public class FileReader extends Reader {

	/**
	 * 
	 * @param inputVO
	 * @return
	 */
	@Override
	public List<CustomerVO> readInput(InputVO inputVO) throws InvalidInputException,IOException {
		List<CustomerVO> inputList = new ArrayList();
		BufferedReader reader = null;
		CustomerVO tempCustomerVO = null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			reader = new BufferedReader(new java.io.FileReader(inputVO.getWorkingDirectory() + "/input.txt"));
			String line = reader.readLine();
			while (line != null) {
				tempCustomerVO = objectMapper.readValue(line, CustomerVO.class);
				inputList.add(tempCustomerVO);
				line = reader.readLine();
			}
			reader.close();
		} catch (JsonParseException ex) {
			reader.close();
			throw new InvalidInputException(
					"Invalid customer data format. Please make sure the inputs are in proper json format. \n Please find the sample: \"{\"latitude\": \"52.986375\", \"user_id\": 12, \"name\": \"Christina McArdle\", \"longitude\": \"-6.043701\"}\"");
		} catch (FileNotFoundException e) {
			reader.close();
			throw new InvalidInputException(
					"Input file not found. Please check the working directory and the file with name input.txt");
		}
		return inputList;
	}

}
