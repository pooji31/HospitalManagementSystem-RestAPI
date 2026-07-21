package com.mits.exception;

public class InvalidPatientIdException extends RuntimeException{
	
	String msg;
	
	public InvalidPatientIdException(String msg) {
		super();
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}

}
