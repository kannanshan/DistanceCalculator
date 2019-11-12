/**
 * @packageName : com.intercom.app.output.format
 * @className : ComparatorFactory.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.format;

public class ComparatorFactory {
	
	public static CustomComparator getComparatorObject()
	{
		return new UserNameComparator(false);
	}

}
