/**
 * @packageName : com.intercom.test.VO
 * @className : Coordinates.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.vo;

import com.intercom.app.common.InvalidInputException;

public class Coordinates {

	public Coordinates(double latitute, double longitute) throws InvalidInputException {
		if (latitute > 90 || latitute < -90)
			throw new InvalidInputException("Latitude value should be in the range -90 to 90");
		if (longitute > 180 || longitute < -180)
			throw new InvalidInputException("longitude value should be in the range -180 to 180");
		this.latitute = latitute;
		this.longitute = longitute;
	}

	private double latitute;
	private double longitute;

	/**
	 * @return the latitute
	 */
	public double getLatitute() {
		return latitute;
	}

	/**
	 * @param latitute
	 *            the latitute to set
	 */
	public void setLatitute(double latitute) {
		this.latitute = latitute;
	}

	/**
	 * @return the longitute
	 */
	public double getLongitute() {
		return longitute;
	}

	/**
	 * @param longitute
	 *            the longitute to set
	 */
	public void setLongitute(double longitute) {
		this.longitute = longitute;
	}

}
