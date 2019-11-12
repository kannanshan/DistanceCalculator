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
import com.intercom.app.vo.InputVO;

public class OutputFormatter {

	/**
	 * 
	 * @param outputList
	 * @param inputVO
	 */
	public void format(List<CustomerVO> outputList,InputVO inputVO) {
		CustomComparator comparator = ComparatorFactory.getComparatorObject(inputVO);
		Collections.sort(outputList, comparator);
	}

}
