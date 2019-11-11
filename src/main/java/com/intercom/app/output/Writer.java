/**
 * @packageName : com.intercom.test.output
 * @className : Writer.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output;

import java.util.List;

import com.intercom.app.vo.CustomerVO;

public abstract class Writer {

	public abstract void writeOutput(List<CustomerVO> outputList) throws Exception;
	
	public abstract void writeOutput(String message);

}
