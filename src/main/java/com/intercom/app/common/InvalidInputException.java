/**
 * @packageName : com.intercom.app.common
 * @className : InvalidInputException.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.common;

public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String msg) {
		super(msg);
	}

}
