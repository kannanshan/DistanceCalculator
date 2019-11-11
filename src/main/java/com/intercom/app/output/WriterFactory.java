/**
 * @packageName : com.intercom.app.output
 * @className : WriterFactory.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output;

import com.intercom.app.constants.AppConstants;
import com.intercom.app.input.CommandLineReader;
import com.intercom.app.input.FileReader;
import com.intercom.app.input.Reader;

public class WriterFactory {
	
	public static Writer getWriterObject(int readerId)
	{
		if(readerId == AppConstants.WRITER_TYPE.FILE.getWriterId())
		{
			return new FileWriter();
		}
		if(readerId == AppConstants.WRITER_TYPE.COMMAND_LINE.getWriterId())
		{
			return new CommandLineWriter();
		}
		return null;
	}

}
