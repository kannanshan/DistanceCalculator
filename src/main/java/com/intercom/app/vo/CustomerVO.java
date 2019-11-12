/**
 * @packageName : com.intercom.test.VO
 * @className : CustomersVO.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerVO {

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("user_id")
	private int userId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("longitude")
	private String longitude;
	
	@JsonIgnore
	private double distanceFromSource;

	/**
	 * @return the latitute
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitute
	 *            the latitute to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String toString() {
		return "{\"user_id\":" + this.userId + ", \"name\":" + this.name+"\"}";
	}

	/**
	 * @return the distanceFromSource
	 */
	public double getDistanceFromSource() {
		return distanceFromSource;
	}

	/**
	 * @param distanceFromSource the distanceFromSource to set
	 */
	public void setDistanceFromSource(double distanceFromSource) {
		this.distanceFromSource = distanceFromSource;
	}
	
	

}
