/**
 * @packageName : com.intercom.app.output.format
 * @className : UserNameComparator.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.format;

import java.util.Comparator;

import com.intercom.app.vo.CustomerVO;

public class UserNameComparator extends CustomComparator {

	UserNameComparator() {
		this(true);
	}
	UserNameComparator(boolean sortOrderflag) {
		super(sortOrderflag);
	}

	public int compare(CustomerVO o1, CustomerVO o2) {
		int returnValue = 0;
		if (this.sortOrderflag)
			returnValue = o1.getName().compareTo(o2.getName());
		else
			returnValue = o2.getName().compareTo(o1.getName());
		return returnValue;
	}

}