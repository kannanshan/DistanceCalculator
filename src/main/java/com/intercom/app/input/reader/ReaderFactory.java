/**
 * @packageName : com.intercom.app.input
 * @className : ReaderFactory.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.input.reader;

import com.intercom.app.constants.AppConstants;

public class ReaderFactory {
	
	public static Reader getReaderObject(int readerId)
	{
		if(readerId == AppConstants.READER_TYPE.FILE.getReaderId())
		{
			return new FileReader();
		}
		if(readerId == AppConstants.READER_TYPE.COMMAND_LINE.getReaderId())
		{
			return new CommandLineReader();
		}
		return null;
	}

}
