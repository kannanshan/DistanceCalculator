/**
 * @packageName : com.intercom.app.output
 * @className : WriterFactory.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.output.writer;

import com.intercom.app.constants.AppConstants;
import com.intercom.app.input.reader.CommandLineReader;
import com.intercom.app.input.reader.FileReader;
import com.intercom.app.input.reader.Reader;

public class WriterFactory {
	
	/**
	 * 
	 * @param readerId
	 * @return
	 */
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
