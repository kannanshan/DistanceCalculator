package com.intercom.app.output.format;

import com.intercom.app.vo.CustomerVO;

public class DistanceComparator extends CustomComparator {

	DistanceComparator() {
		this(true);
	}

	DistanceComparator(boolean sortOrderflag) {
		super(sortOrderflag);
	}

	public int compare(CustomerVO o1, CustomerVO o2) {
		int returnValue = 0;
		if (this.sortOrderflag)
			returnValue = Double.compare(o1.getDistanceFromSource(), o2.getDistanceFromSource());
		else
			returnValue = Double.compare(o2.getDistanceFromSource(), o1.getDistanceFromSource());
		return returnValue;
	}

}
