/**
 * @packageName : com.intercom.app.constants
 * @className : AppConstants.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.constants;

public class AppConstants {
	
	public static enum SORT_PARMETER {
		USER_NAME("NAME", 2), USER_ID("ID", 1);

		private String parameterName;
		private int parameterId;

		private SORT_PARMETER(String parameterName, int parameterId) {
			this.parameterName = parameterName;
			this.parameterId = parameterId;
		}

		/**
		 * @return the parameterName
		 */
		public String getParameterName() {
			return parameterName;
		}

		/**
		 * @param parameterName
		 *            the parameterName to set
		 */
		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		/**
		 * @return the parameterId
		 */
		public int getParameterId() {
			return parameterId;
		}

		/**
		 * @param parameterId
		 *            the parameterId to set
		 */
		public void setParameterId(int parameterId) {
			this.parameterId = parameterId;
		}
		
		public static int getParameterId(String name)
		{
			if(name.equalsIgnoreCase("name"))
				return USER_NAME.getParameterId();
			return USER_ID.getParameterId();
			
		}

	}

	public static enum READER_TYPE {
		FILE("FILE", 1), COMMAND_LINE("COMMAND_LINE", 2);

		private String readerName;
		private int readerId;

		private READER_TYPE(String readerName, int readerId) {
			this.readerName = readerName;
			this.readerId = readerId;
		}

		/**
		 * @return the readerName
		 */
		public String getReaderName() {
			return readerName;
		}

		/**
		 * @param readerName
		 *            the readerName to set
		 */
		public void setReaderName(String readerName) {
			this.readerName = readerName;
		}

		/**
		 * @return the readerId
		 */
		public int getReaderId() {
			return readerId;
		}

		/**
		 * @param readerId
		 *            the readerId to set
		 */
		public void setReaderId(int readerId) {
			this.readerId = readerId;
		}
		
		public static int getReaderId(String name)
		{
			if(name.equalsIgnoreCase("file"))
				return FILE.getReaderId();
			return COMMAND_LINE.getReaderId();
		}

	}
	
	public static enum WRITER_TYPE {
		FILE("FILE", 1), COMMAND_LINE("COMMAND_LINE", 2);

		private String writerName;
		private int writerId;

		private WRITER_TYPE(String writerName, int writerId) {
			this.writerName = writerName;
			this.writerId = writerId;
		}

		/**
		 * @return the writerName
		 */
		public String getWriterName() {
			return writerName;
		}

		/**
		 * @param writerName
		 *            the writerName to set
		 */
		public void setWriterName(String writerName) {
			this.writerName = writerName;
		}

		/**
		 * @return the writerId
		 */
		public int getWriterId() {
			return writerId;
		}

		/**
		 * @param writerId
		 *            the writerId to set
		 */
		public void setWriterId(int writerId) {
			this.writerId = writerId;
		}
		
		public static int getWriterId(String name)
		{
			if(name.equalsIgnoreCase("file"))
				return FILE.getWriterId();
			return COMMAND_LINE.getWriterId();
		}

	}


}
