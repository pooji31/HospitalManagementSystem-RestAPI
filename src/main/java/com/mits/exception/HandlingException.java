package com.mits.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlingException {

	@ExceptionHandler(InvalidDoctorIdException.class)
	public ResponseEntity<String> handleException(@PathVariable InvalidDoctorIdException exception){
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidPatientIdException.class)
	public ResponseEntity<String> handleException(@PathVariable InvalidPatientIdException exception){
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
}
