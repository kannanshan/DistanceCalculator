/**
 * @packageName : com.intercom.app
 * @className : Main.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app;

import com.intercom.app.bo.ApplicationBO;
import com.intercom.app.common.InvalidInputException;
import com.intercom.app.vo.InputVO;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			String s = "-d 100 -s 53.339428 -6.257664 -so desc -sp name -i file -o command_line -w /Users/Kannan/Desp";
			args = s.split(" ");
			if (args.length == 1 && args[0] == "-h")
				System.out.println();
			InputParser parser = new InputParser();
			InputVO inputVO = parser.parseAndGetInputVO(args);
			parser.validateInput(inputVO);
			ApplicationBO app = new ApplicationBO();
			app.getCustomerList(inputVO);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Something went wrong in our application");
		}
	}

}
