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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intercom.app.vo.CustomerVO;

public class FileReader extends Reader {

	@Override
	public List<CustomerVO> readInput() throws Exception {
		List<CustomerVO> inputList = new ArrayList();
		BufferedReader reader = null;
		CustomerVO tempCustomerVO = null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			reader = new BufferedReader(new java.io.FileReader("/Users/Kannan/Desktop/input.txt"));
			String line = reader.readLine();
			while (line != null) {
				tempCustomerVO = objectMapper.readValue(line, CustomerVO.class);
				inputList.add(tempCustomerVO);
				line = reader.readLine();
			}
			reader.close();
		} catch (JsonParseException ex) {
			throw new Exception("Invalid input. Please check the input");
		} catch (FileNotFoundException e) {
			throw new Exception("Input file not found. Please check the file location");
		}
		return inputList;
	}

}
