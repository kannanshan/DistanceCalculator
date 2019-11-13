/**
 * @packageName : com.intercom.test.common
 * @className : CommonUtils.java
 * @date : 11-Nov-2019
 * @author : Kannan
 * @version : 1.0
 */

package com.intercom.app.common;

import com.intercom.app.vo.Coordinates;

public class CommonUtils {
	
	/**
	 * Multiplying the result with radius value 6371km.
	 * @param source
	 * @param destination
	 * @return
	 */
	public static double getDistanceByGreateCircle(Coordinates source, Coordinates destination) { 
        double x1 = Math.toRadians(source.getLatitute());
        double y1 = Math.toRadians(source.getLongitute());
        double x2 = Math.toRadians(destination.getLatitute());
        double y2 = Math.toRadians(destination.getLongitute());
        double angle1 = Math.acos(Math.sin(x1) * Math.sin(x2)
                      + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		angle1 = angle1 * 6371;
        //angle1 = Math.toDegrees(angle1)* 69.11 * 1.61;
        return angle1;
    }
	public static void main(String args[])throws Exception
	{
		Coordinates source = new Coordinates(53.339428, -6.257664);
		Coordinates destination = new Coordinates(53.807778, -7.714444);
		System.out.println(CommonUtils.getDistanceByGreateCircle(source, destination));
	}
}
