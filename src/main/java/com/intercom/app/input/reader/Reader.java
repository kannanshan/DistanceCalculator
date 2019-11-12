/**
 * @packageName : com.intercom.test.inputs
 * @className : InputReader.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.input.reader;

import java.io.IOException;
import java.util.List;

import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.CustomerVO;
import com.intercom.app.vo.InputVO;

public abstract class Reader {
	
	public abstract List<CustomerVO> readInput(InputVO inputVO) throws InvalidInputException,IOException;
	
}
