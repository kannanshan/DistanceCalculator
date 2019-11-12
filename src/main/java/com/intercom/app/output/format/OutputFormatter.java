/**
 * @packageName : com.intercom.app.output
 * @className : OutputFormatter.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.format;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.intercom.app.vo.CustomerVO;

public class OutputFormatter {

	public void format(List<CustomerVO> outputList) {
		CustomComparator comparator = ComparatorFactory.getComparatorObject();
		Collections.sort(outputList, comparator);
	}

}
