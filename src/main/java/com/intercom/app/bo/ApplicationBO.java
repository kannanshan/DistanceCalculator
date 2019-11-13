/**
 * @packageName : com.intercom.app.bo
 * @className : ApplicationBO.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.bo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.intercom.app.common.CommonUtils;
import com.intercom.app.common.InvalidInputException;
import com.intercom.app.input.reader.CommandLineReader;
import com.intercom.app.input.reader.Reader;
import com.intercom.app.input.reader.ReaderFactory;
import com.intercom.app.output.format.OutputFormatter;
import com.intercom.app.output.writer.Writer;
import com.intercom.app.output.writer.WriterFactory;
import com.intercom.app.vo.Coordinates;
import com.intercom.app.vo.CustomerVO;
import com.intercom.app.vo.InputVO;

public class ApplicationBO {

	/**
	 * 
	 * @param inputVO
	 * @return
	 * @throws Exception
	 */
	public List<CustomerVO> getCustomerList(InputVO inputVO) throws InvalidInputException,IOException {
		Writer writer = null;
		List<CustomerVO> outputList = null;
		List<CustomerVO> inputList = null;
		writer = WriterFactory.getWriterObject(inputVO.getOutputType());
		Reader reader = ReaderFactory.getReaderObject(inputVO.getInputType());
		inputList = reader.readInput(inputVO);
		outputList = getValidCustomerList(inputList, inputVO.getSourceCoordinates(), inputVO.getDistanceRange());
		OutputFormatter formatter = new OutputFormatter();
		formatter.format(outputList, inputVO);
		writer.writeOutput(outputList, inputVO);
		return outputList;
	}

	/**
	 * 
	 * @param inputList
	 * @param sourceCoordinate
	 * @param givenDistance
	 * @return
	 */
	public List<CustomerVO> getValidCustomerList(List<CustomerVO> inputList, Coordinates sourceCoordinate,
			Double givenDistance) throws InvalidInputException{
		List<CustomerVO> outputList = new ArrayList();
		for (CustomerVO customerVO : inputList) {
			double distanceFromSource = CommonUtils.getDistanceByGreateCircle(sourceCoordinate, new Coordinates(
					Double.valueOf(customerVO.getLatitude()), Double.valueOf(customerVO.getLongitude())));
			customerVO.setDistanceFromSource(distanceFromSource);
			if (distanceFromSource <= givenDistance) {
				outputList.add(customerVO);
			}
		}
		return outputList;
	}

}
