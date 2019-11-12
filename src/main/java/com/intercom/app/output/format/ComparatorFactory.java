/**
 * @packageName : com.intercom.app.output.format
 * @className : ComparatorFactory.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.format;

import com.intercom.app.constants.AppConstants;
import com.intercom.app.vo.InputVO;

public class ComparatorFactory {
	
	/**
	 * 
	 * @param inputVO
	 * @return
	 */
	public static CustomComparator getComparatorObject(InputVO inputVO)
	{
		CustomComparator comparator = null;
		if(inputVO.getSortParameter() == AppConstants.SORT_PARMETER.USER_ID.getParameterId())
			comparator =  new UserIDComparator(inputVO.isSortOrder());
		if(inputVO.getSortParameter() == AppConstants.SORT_PARMETER.USER_NAME.getParameterId())
			comparator =  new UserNameComparator(inputVO.isSortOrder());
		return comparator;
	}

}
