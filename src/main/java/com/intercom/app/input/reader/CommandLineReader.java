/**
 * @packageName : com.intercom.test.input
 * @className : CommandLineReader.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.input.reader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.CustomerVO;
import com.intercom.app.vo.InputVO;

public class CommandLineReader extends Reader {

	/**
	 * 
	 * @param inputVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<CustomerVO> readInput(InputVO inputVO) throws InvalidInputException, IOException {
		List<CustomerVO> inputList = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		String input = null;
		CustomerVO tempCustomerVO = null;
		System.out.println("Enter the number of Customer. (Not more than 100):");
		int objectCount = Integer.parseInt(scanner.nextLine());
		try {
			if (objectCount == 0 || objectCount > 100){
				scanner.close();
				throw new InvalidInputException(
						"Invalid inputs: Number of customer objects should be between 1 and 100");
			}
			System.out.println(
					"Enter the customer objects one by one in json format. Sample input: \"{\"latitude\": \"52.986375\", \"user_id\": 12, \"name\": \"Christina McArdle\", \"longitude\": \"-6.043701\"}\"");
			ObjectMapper objectMapper = new ObjectMapper();
			for (int i = 0; i < objectCount; i++) {
				input = scanner.nextLine();
				tempCustomerVO = objectMapper.readValue(input, CustomerVO.class);
				inputList.add(tempCustomerVO);
			}
			scanner.close();
		} catch (JsonParseException ex) {
			scanner.close();
			throw new InvalidInputException(
					"Invalid customer data format. Please make sure the inputs are in proper json format. \n Please find the sample: \"{\"latitude\": \"52.986375\", \"user_id\": 12, \"name\": \"Christina McArdle\", \"longitude\": \"-6.043701\"}\"");
		}
		return inputList;
	}

}
