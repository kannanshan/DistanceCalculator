/**
 * @packageName : com.intercom.test.output
 * @className : FileWriter.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.writer;

import java.io.BufferedWriter;
import java.util.List;

import com.intercom.app.vo.CustomerVO;

public class FileWriter extends Writer {

	@Override
	public void writeOutput(List<CustomerVO> outputList) throws Exception {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new java.io.FileWriter("/Users/Kannan/Desktop/output.txt"));
			for (CustomerVO customerVO : outputList) {
				writer.write(customerVO.toString());
				writer.newLine();
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void writeOutput(String message) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new java.io.FileWriter("/Users/Kannan/Desktop/output.txt"));
			writer.write(message);
			writer.newLine();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
