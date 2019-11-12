/**
 * @packageName : com.intercom.app.output.format
 * @className : UserIDComparator.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.format;

import java.util.Comparator;

import com.intercom.app.vo.CustomerVO;

public class UserIDComparator extends CustomComparator {

	UserIDComparator() {
		this(true);
	}

	UserIDComparator(boolean sortOrderflag) {
		super(sortOrderflag);
	}

	public int compare(CustomerVO o1, CustomerVO o2) {
		int returnValue = 0;
		if (this.sortOrderflag)
			returnValue = Integer.compare(o1.getUserId(), o2.getUserId());
		else
			returnValue = Integer.compare(o2.getUserId(), o1.getUserId());
		return returnValue;
	}

}
