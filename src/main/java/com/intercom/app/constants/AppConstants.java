/**
 * @packageName : com.intercom.app.constants
 * @className : AppConstants.java
 * @date : 11-Nov-2019
 * @author : kannans
 * @version : 1.0
 */

package com.intercom.app.constants;

public class AppConstants {

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

	}


}
