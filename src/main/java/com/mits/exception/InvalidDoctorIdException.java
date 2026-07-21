package com.mits.exception;

public class InvalidDoctorIdException extends RuntimeException{
	
	String msg;
	
	public InvalidDoctorIdException(String msg) {
		super();
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}

}
