package com.capg.mvc.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND) 
public class TraineeNotFoundException extends RuntimeException{

	public TraineeNotFoundException(String msg) {
		super(msg);
	}
	
}
