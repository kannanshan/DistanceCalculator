/**
 * @packageName : com.intercom.test.common
 * @className : CommonUtils.java
 * @date : 11-Nov-2019
 * @author : Kannan
 * @version : 1.0
 */

package com.intercom.test.common;

public class CommonUtils {
	
	public static double getDistanceByGreateCircle(Double SourceLat ) { 
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double angle1 = Math.acos(Math.sin(x1) * Math.sin(x2)
                      + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        angle1 = Math.toDegrees(angle1);
        double distance1 = 60 * angle1;
        double a = Math.pow(Math.sin((x2-x1)/2), 2)
                 + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2-y1)/2), 2);
        double angle2 = 2 * Math.asin(Math.min(1, Math.sqrt(a)));
        angle2 = Math.toDegrees(angle2);
        double distance2 = 60 * angle2;

    }
}
