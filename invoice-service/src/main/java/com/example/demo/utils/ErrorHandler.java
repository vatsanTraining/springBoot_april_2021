package com.example.demo.utils;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.model.ErrorDetails;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

	
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request){
		
				      ErrorDetails errorDetails = 
				    		  new ErrorDetails(LocalDateTime.now(), 
				    		             ex.getMessage(),
		                                 request.getDescription(false));
				      
		      return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
