/**
 * @packageName : com.intercom.app.bo
 * @className : ApplicationBOTest.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.bo;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.Coordinates;
import com.intercom.app.vo.CustomerVO;
import com.intercom.app.vo.InputVO;

public class ApplicationBOTest {

	@Test
	public void testValidInput1() throws Exception {
		List<CustomerVO> inputList = new ArrayList();
		ApplicationBO app = new ApplicationBO();
		Coordinates sourceCoordinate = new Coordinates(53.339428, -6.257664);
		double givenDistance = 10;
		CustomerVO cust = new CustomerVO();
		cust.setLatitude("1.2");
		cust.setLongitude("23");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("1.2");
		cust.setLongitude("23");
		inputList.add(cust);
		Class[] cArg = new Class[3];
		cArg[0] = List.class;
		cArg[1] = Coordinates.class;
		cArg[2] = Double.class;
		Method method = ApplicationBO.class.getDeclaredMethod("getValidCustomerList", cArg);
		method.setAccessible(true);
		Object[] obj = new Object[3];
		obj[0] = inputList;
		obj[1] = sourceCoordinate;
		obj[2] = givenDistance;
		inputList = (List<CustomerVO>) method.invoke(app, obj);
		Assert.assertEquals(inputList.size(), 0);
	}

	@Test
	public void testValidInput2() throws Exception {
		List<CustomerVO> inputList = new ArrayList();
		ApplicationBO app = new ApplicationBO();
		Coordinates sourceCoordinate = new Coordinates(53.339428, -6.257664);
		double givenDistance = 10;
		CustomerVO cust = new CustomerVO();
		cust.setLatitude("1.2");
		cust.setLongitude("23");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("1.2");
		cust.setLongitude("23");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("1.2");
		cust.setLongitude("23");
		inputList.add(cust);
		Class[] cArg = new Class[3];
		cArg[0] = List.class;
		cArg[1] = Coordinates.class;
		cArg[2] = Double.class;
		Method method = ApplicationBO.class.getDeclaredMethod("getValidCustomerList", cArg);
		method.setAccessible(true);
		Object[] obj = new Object[3];
		obj[0] = inputList;
		obj[1] = sourceCoordinate;
		obj[2] = givenDistance;
		inputList = (List<CustomerVO>) method.invoke(app, obj);
		Assert.assertEquals(inputList.size(), 0);
	}

}
