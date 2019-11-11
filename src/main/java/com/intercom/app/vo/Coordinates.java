/**
 * @packageName : com.intercom.test.VO
 * @className : Coordinates.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.vo;

public class Coordinates {

	public Coordinates(double latitute, double longitute) {
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
