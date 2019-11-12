/**
 * @packageName : com.intercom.app
 * @className : InputParser.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app;

import com.intercom.app.common.InvalidInputException;
import com.intercom.app.constants.AppConstants;
import com.intercom.app.vo.InputVO;

public class InputParser {

	/**
	 * 
	 * @param args
	 * @return
	 * @throws Exception
	 */
	public InputVO parseAndGetInputVO(String args[]) throws InvalidInputException {
		InputVO inputVO = new InputVO();
		try {
			for (int i = 0; i < args.length; i++) {
				String temp = args[i];
				if (temp.equals("-s"))
					inputVO.setSourceCoordinates(Double.parseDouble(args[++i]), Double.parseDouble(args[++i]));
				if (temp.equals("-d"))
					inputVO.setDistanceRange(Double.parseDouble(args[++i]));
				if (temp.equals("-sp"))
					inputVO.setSortParameter(AppConstants.SORT_PARMETER.getParameterId(args[++i]));
				if (temp.equals("-so"))
					inputVO.setSortOrder(args[++i].equalsIgnoreCase("asc") ? true : false);
				if (temp.equals("-i"))
					inputVO.setInputType(AppConstants.READER_TYPE.getReaderId(args[++i]));
				if (temp.equals("-o"))
					inputVO.setOutputType(AppConstants.WRITER_TYPE.getWriterId(args[++i]));
				if (temp.equals("-w"))
					inputVO.setWorkingDirectory(args[++i]);
			}
		} catch (NumberFormatException e) {
			throw new InvalidInputException(
					"Make sure the coordinates and distance parameter are Numbers. Check the help menu using the -h command to understand the inputs.");
		} catch (Exception e) {
			throw new InvalidInputException("Check the help menu using the -h command to understand the inputs.");
		}
		return inputVO;

	}

	/**
	 * 
	 * @param inputVO
	 * @throws Exception
	 */
	public void validateInput(InputVO inputVO) throws InvalidInputException {
		if (inputVO.getDistanceRange() <= 0 || inputVO.getDistanceRange()>10000)
			throw new InvalidInputException(
					"Invalid input. -d  parameter is missing or the range is < 0 or > 10000: check the help menu using the -h command to understand the inputs");
		if (inputVO.getSourceCoordinates() == null)
			throw new InvalidInputException(
					"Invalid input. -s parameter is missing : check the help menu using the -h command to understand the inputs");
		if (inputVO.getWorkingDirectory() == null)
			throw new InvalidInputException(
					"Invalid input. -w  parameter is missing : check the help menu using the -h command to understand the inputs");
	}

}
