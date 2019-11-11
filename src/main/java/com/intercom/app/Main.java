/**
 * @packageName : com.intercom.app
 * @className : Main.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app;

import com.intercom.app.bo.ApplicationBO;
public class Main {

	public static void main(String args[]) {
		try {
			ApplicationBO app = new ApplicationBO();
			app.getCustomerList();
		} catch (Exception e) {
			System.out.println("Something went wrong in our application");
		}
	}

}
