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
	
	public static double getDistanceByGreateCircle(Coordinates source, Coordinates destination) { 
        double x1 = Math.toRadians(source.getLongitute());
        double y1 = Math.toRadians(source.getLatitute());
        double x2 = Math.toRadians(destination.getLongitute());
        double y2 = Math.toRadians(destination.getLatitute());
        double angle1 = Math.acos(Math.sin(x1) * Math.sin(x2)
                      + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        angle1 = Math.toDegrees(angle1)*96.5;
        return angle1;
    }
}
