/**
 * @packageName : com.intercom.test.output
 * @className : Writer.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.writer;

import java.io.IOException;
import java.util.List;

import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.CustomerVO;
import com.intercom.app.vo.InputVO;

public abstract class Writer {

	public abstract void writeOutput(List<CustomerVO> outputList,InputVO inputVO) throws InvalidInputException,IOException;
	
	public abstract void writeOutput(String message,InputVO inputVO) throws InvalidInputException,IOException;

}
