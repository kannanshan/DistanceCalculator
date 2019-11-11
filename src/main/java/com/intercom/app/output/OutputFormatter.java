/**
 * @packageName : com.intercom.app.output
 * @className : OutputFormatter.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.intercom.app.vo.CustomerVO;

public class OutputFormatter {

	public void format(List<CustomerVO> outputList) {
		Collections.sort(outputList,new UserIDComparator());
	}
	
	static class UserIDComparator implements Comparator<CustomerVO>
	{

		public int compare(CustomerVO o1, CustomerVO o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.getUserId(), o2.getUserId());
		}
		
	}

}
