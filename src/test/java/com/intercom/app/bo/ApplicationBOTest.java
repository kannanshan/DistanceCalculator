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
		Coordinates source = new Coordinates(53.339428, -6.257664);
		double givenDistance = 10;
		CustomerVO cust = new CustomerVO();
		cust.setLatitude("52.833502");//161.35
		cust.setLongitude("-8.522366");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("51.92893"); //313.25
		cust.setLongitude("-10.27699");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("52.986375"); //41.76
		cust.setLongitude("-6.043701");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("53.807778"); //109.38
		cust.setLongitude("-7.714444");
		inputList.add(cust);
		Class[] cArg = new Class[3];
		cArg[0] = List.class;
		cArg[1] = Coordinates.class;
		cArg[2] = Double.class;
		Method method = ApplicationBO.class.getDeclaredMethod("getValidCustomerList", cArg);
		method.setAccessible(true);
		Object[] obj = new Object[3];
		obj[0] = inputList;
		obj[1] = source;
		obj[2] = givenDistance;
		inputList = (List<CustomerVO>) method.invoke(app, obj);
		Assert.assertEquals(inputList.size(), 0);
	}

	@Test
	public void testValidInput2() throws Exception {
		List<CustomerVO> inputList = new ArrayList();
		ApplicationBO app = new ApplicationBO();
		Coordinates source = new Coordinates(53.339428, -6.257664);
		double givenDistance = 200;
		CustomerVO cust = new CustomerVO();
		cust.setLatitude("52.833502");//161.35
		cust.setLongitude("-8.522366");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("51.92893"); //313.25
		cust.setLongitude("-10.27699");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("52.986375"); //41.76
		cust.setLongitude("-6.043701");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("53.807778"); //109.38
		cust.setLongitude("-7.714444");
		inputList.add(cust);
		Class[] cArg = new Class[3];
		cArg[0] = List.class;
		cArg[1] = Coordinates.class;
		cArg[2] = Double.class;
		Method method = ApplicationBO.class.getDeclaredMethod("getValidCustomerList", cArg);
		method.setAccessible(true);
		Object[] obj = new Object[3];
		obj[0] = inputList;
		obj[1] = source;
		obj[2] = givenDistance;
		inputList = (List<CustomerVO>) method.invoke(app, obj);
		Assert.assertEquals(inputList.size(), 3);
	}
	
	@Test
	public void testValidInput3() throws Exception {
		List<CustomerVO> inputList = new ArrayList();
		ApplicationBO app = new ApplicationBO();
		Coordinates source = new Coordinates(53.339428, -6.257664);
		double givenDistance = 50;
		CustomerVO cust = new CustomerVO();
		cust.setLatitude("52.833502");//161.35
		cust.setLongitude("-8.522366");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("51.92893"); //313.25
		cust.setLongitude("-10.27699");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("52.986375"); //41.76
		cust.setLongitude("-6.043701");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("53.807778"); //109.38
		cust.setLongitude("-7.714444");
		inputList.add(cust);
		Class[] cArg = new Class[3];
		cArg[0] = List.class;
		cArg[1] = Coordinates.class;
		cArg[2] = Double.class;
		Method method = ApplicationBO.class.getDeclaredMethod("getValidCustomerList", cArg);
		method.setAccessible(true);
		Object[] obj = new Object[3];
		obj[0] = inputList;
		obj[1] = source;
		obj[2] = givenDistance;
		inputList = (List<CustomerVO>) method.invoke(app, obj);
		Assert.assertEquals(inputList.size(), 1);
	}
	
	@Test
	public void testValidInput4() throws Exception {
		List<CustomerVO> inputList = new ArrayList();
		ApplicationBO app = new ApplicationBO();
		Coordinates source = new Coordinates(53.339428, -6.257664);
		double givenDistance = 109;
		CustomerVO cust = new CustomerVO();
		cust.setLatitude("52.833502");//161.35
		cust.setLongitude("-8.522366");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("51.92893"); //313.25
		cust.setLongitude("-10.27699");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("52.986375"); //41.76
		cust.setLongitude("-6.043701");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("53.807778"); //109.38
		cust.setLongitude("-7.714444");
		inputList.add(cust);
		Class[] cArg = new Class[3];
		cArg[0] = List.class;
		cArg[1] = Coordinates.class;
		cArg[2] = Double.class;
		Method method = ApplicationBO.class.getDeclaredMethod("getValidCustomerList", cArg);
		method.setAccessible(true);
		Object[] obj = new Object[3];
		obj[0] = inputList;
		obj[1] = source;
		obj[2] = givenDistance;
		inputList = (List<CustomerVO>) method.invoke(app, obj);
		Assert.assertEquals(inputList.size(), 1);
	}
	
	@Test
	public void testValidInput5() throws Exception {
		List<CustomerVO> inputList = new ArrayList();
		ApplicationBO app = new ApplicationBO();
		Coordinates source = new Coordinates(53.339428, -6.257664);
		double givenDistance = 110;
		CustomerVO cust = new CustomerVO();
		cust.setLatitude("52.833502");//161.35
		cust.setLongitude("-8.522366");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("51.92893"); //313.25
		cust.setLongitude("-10.27699");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("52.986375"); //41.76
		cust.setLongitude("-6.043701");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("53.807778"); //109.38
		cust.setLongitude("-7.714444");
		inputList.add(cust);
		Class[] cArg = new Class[3];
		cArg[0] = List.class;
		cArg[1] = Coordinates.class;
		cArg[2] = Double.class;
		Method method = ApplicationBO.class.getDeclaredMethod("getValidCustomerList", cArg);
		method.setAccessible(true);
		Object[] obj = new Object[3];
		obj[0] = inputList;
		obj[1] = source;
		obj[2] = givenDistance;
		inputList = (List<CustomerVO>) method.invoke(app, obj);
		Assert.assertEquals(inputList.size(), 2);
	}
	
	@Test
	public void testValidInput6() throws Exception {
		List<CustomerVO> inputList = new ArrayList();
		ApplicationBO app = new ApplicationBO();
		Coordinates source = new Coordinates(53.339428, -6.257664);
		double givenDistance = 500;
		CustomerVO cust = new CustomerVO();
		cust.setLatitude("52.833502");//161.35
		cust.setLongitude("-8.522366");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("51.92893"); //313.25
		cust.setLongitude("-10.27699");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("52.986375"); //41.76
		cust.setLongitude("-6.043701");
		inputList.add(cust);
		cust = new CustomerVO();
		cust.setLatitude("53.807778"); //109.38
		cust.setLongitude("-7.714444");
		inputList.add(cust);
		Class[] cArg = new Class[3];
		cArg[0] = List.class;
		cArg[1] = Coordinates.class;
		cArg[2] = Double.class;
		Method method = ApplicationBO.class.getDeclaredMethod("getValidCustomerList", cArg);
		method.setAccessible(true);
		Object[] obj = new Object[3];
		obj[0] = inputList;
		obj[1] = source;
		obj[2] = givenDistance;
		inputList = (List<CustomerVO>) method.invoke(app, obj);
		Assert.assertEquals(inputList.size(), 4);
	}

}
