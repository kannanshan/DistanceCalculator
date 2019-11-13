/**
 * @packageName : com.intercom.app.vo
 * @className : InputVO.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.vo;

import com.intercom.app.common.InvalidInputException;
import com.intercom.app.constants.AppConstants;

public class InputVO {

	private double distanceRange;
	private Coordinates sourceCoordinates;
	private int sortParameter;
	private boolean sortOrder;
	private int inputType;
	private String workingDirectory;
	private int outputType;

	public InputVO() {
		outputType = AppConstants.WRITER_TYPE.FILE.getWriterId();
		inputType = AppConstants.READER_TYPE.FILE.getReaderId();
		sortParameter = AppConstants.SORT_PARMETER.USER_ID.getParameterId();
		workingDirectory="";
		sortOrder = true;
	}

	/**
	 * @return the distanceRange
	 */
	public double getDistanceRange() {
		return distanceRange;
	}

	/**
	 * @param distanceRange
	 *            the distanceRange to set
	 */
	public void setDistanceRange(double distanceRange) {
		this.distanceRange = distanceRange;
	}

	/**
	 * @return the sourceCoordinates
	 */
	public Coordinates getSourceCoordinates() {
		return sourceCoordinates;
	}

	/**
	 * @param sourceCoordinates
	 *            the sourceCoordinates to set
	 */
	public void setSourceCoordinates(double latitude, double longitude) throws InvalidInputException{
		this.sourceCoordinates = new Coordinates(latitude, longitude);
	}

	/**
	 * @return the sortParameter
	 */
	public int getSortParameter() {
		return sortParameter;
	}

	/**
	 * @param sortParameter
	 *            the sortParameter to set
	 */
	public void setSortParameter(int sortParameter) {
		this.sortParameter = sortParameter;
	}

	/**
	 * @return the sortOrder
	 */
	public boolean isSortOrder() {
		return sortOrder;
	}

	/**
	 * @param sortOrder
	 *            the sortOrder to set
	 */
	public void setSortOrder(boolean sortOrder) {
		this.sortOrder = sortOrder;
	}

	/**
	 * @return the inputType
	 */
	public int getInputType() {
		return inputType;
	}

	/**
	 * @param inputType
	 *            the inputType to set
	 */
	public void setInputType(int inputType) {
		this.inputType = inputType;
	}

	/**
	 * @return the outputType
	 */
	public int getOutputType() {
		return outputType;
	}

	/**
	 * @param outputType
	 *            the outputType to set
	 */
	public void setOutputType(int outputType) {
		this.outputType = outputType;
	}

	/**
	 * @return the workingDirectory
	 */
	public String getWorkingDirectory() {
		return workingDirectory;
	}

	/**
	 * @param workingDirectory the workingDirectory to set
	 */
	public void setWorkingDirectory(String workingDirectory) {
		this.workingDirectory = workingDirectory;
	}
	
	

}
