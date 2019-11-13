/**
 * @packageName : com.intercom.app.common
 * @className : CommonUtilsTest.java
 * @date : 12-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.common;

import org.junit.Test;

import com.intercom.app.vo.Coordinates;

import org.junit.Assert;

public class CommonUtilsTest {

	@Test
	public void testValidInput1() throws InvalidInputException{
		Coordinates source = new Coordinates(53.32055555555556, -1.7297222222222221);
		Coordinates destination = new Coordinates(53.31861111111111, -1.6997222222222223);
		Assert.assertEquals(CommonUtils.getDistanceByGreateCircle(source, destination), 2.004367, 0.5);
	}

	@Test(expected = NullPointerException.class)
	public void testValidInput2() throws InvalidInputException{
		Coordinates source = new Coordinates(53.32055555555556, -1.7297222222222221);
		Coordinates destination = new Coordinates(53.31861111111111, -1.6997222222222223);
		Assert.assertEquals(CommonUtils.getDistanceByGreateCircle(source, null), 2.9010690842502798, 0.5);
	}

	@Test(expected = NullPointerException.class)
	public void testValidInput3() throws InvalidInputException{
		Coordinates source = new Coordinates(53.32055555555556, -1.7297222222222221);
		Coordinates destination = new Coordinates(53.31861111111111, -1.6997222222222223);
		Assert.assertEquals(CommonUtils.getDistanceByGreateCircle(null, null), 2.9010690842502798, 0.5);
	}
	
	@Test
	public void testValidInput4() throws InvalidInputException{
		Coordinates source = new Coordinates(59.9, -30.3);
		Coordinates destination = new Coordinates(52.986375, -6.043701);
		Assert.assertEquals(CommonUtils.getDistanceByGreateCircle(source, destination), 1664.24, 0.5);
	}
	
	@Test
	public void testValidInput5() throws InvalidInputException{
		Coordinates source = new Coordinates(0.0, 0.0);
		Coordinates destination = new Coordinates(52.986375, -6.043701);
		Assert.assertEquals(CommonUtils.getDistanceByGreateCircle(source, destination), 5918.4712, 0.5);
	}
	
	@Test
	public void testValidInput6() throws InvalidInputException{
		Coordinates source = new Coordinates(0.0, 0.0);
		Coordinates destination = new Coordinates(0.0, 0.0);
		Assert.assertEquals(CommonUtils.getDistanceByGreateCircle(source, destination), 0.0, 0.5);
	}
	
	@Test
	public void testValidInput7() throws InvalidInputException{
		Coordinates source = new Coordinates(-1.0, -1.0);
		Coordinates destination = new Coordinates(-1.0, -1.0);
		Assert.assertEquals(CommonUtils.getDistanceByGreateCircle(source, destination), 0.0, 0.5);
	}

}
