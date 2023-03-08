package com.comit.course._16_exceptions;

public class HelloException extends Exception {

	private static final long serialVersionUID = 1L;

	public HelloException() {
		// TODO Auto-generated constructor stub
	}

	public HelloException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public HelloException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public HelloException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public HelloException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
