/**
 * @packageName : com.intercom.app.bo
 * @className : ApplicationBO.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.bo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.intercom.app.common.CommonUtils;
import com.intercom.app.input.CommandLineReader;
import com.intercom.app.input.Reader;
import com.intercom.app.input.ReaderFactory;
import com.intercom.app.output.format.OutputFormatter;
import com.intercom.app.output.writer.Writer;
import com.intercom.app.output.writer.WriterFactory;
import com.intercom.app.vo.Coordinates;
import com.intercom.app.vo.CustomerVO;

public class ApplicationBO {

	public List<CustomerVO> getCustomerList() throws Exception {
		Writer writer = null;
		List<CustomerVO> outputList = null;
		List<CustomerVO> inputList = null;
		try {
			writer = WriterFactory.getWriterObject(1);
			Reader reader = ReaderFactory.getReaderObject(1);
			inputList = reader.readInput();
			outputList = getValidCustomerList(inputList, new Coordinates(53.339428, -6.257664), 100);
			OutputFormatter formatter = new OutputFormatter();
			formatter.format(outputList);
			writer.writeOutput(outputList);
		} catch (Exception ex) {
			writer.writeOutput(ex.getMessage());
		}
		return outputList;
	}

	private List<CustomerVO> getValidCustomerList(List<CustomerVO> inputList, Coordinates sourceCoordinate,
			double givenDistance) {
		List<CustomerVO> outputList = new ArrayList();
		for (CustomerVO customerVO : inputList) {
			double distanceFromSource = CommonUtils.getDistanceByGreateCircle(sourceCoordinate, new Coordinates(
					Double.valueOf(customerVO.getLatitude()), Double.valueOf(customerVO.getLongitude())));
			if (distanceFromSource <= givenDistance) {
				outputList.add(customerVO);
			}
		}
		return outputList;
	}

}
