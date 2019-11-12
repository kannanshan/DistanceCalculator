/**
 * @packageName : com.intercom.app.output.format
 * @className : CustomerComparator.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.format;

import java.util.Comparator;

import com.intercom.app.vo.CustomerVO;

public abstract class CustomComparator implements Comparator<CustomerVO>{

	boolean sortOrderflag;

	public CustomComparator(boolean sortOrderflag) {
		this.sortOrderflag = sortOrderflag;
	}

}
