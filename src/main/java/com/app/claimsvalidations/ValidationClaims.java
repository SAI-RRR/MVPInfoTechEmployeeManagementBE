package com.app.claimsvalidations;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.dto.ClaimsValidation;

//User validation 
public class ValidationClaims {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> customValidations(MethodArgumentNotValidException exception){
		ClaimsValidation claimsValidation = new ClaimsValidation(new Date(0), "Validation error", exception.getBindingResult().
				getFieldError().getDefaultMessage());
		return new ResponseEntity<>(claimsValidation,HttpStatus.BAD_REQUEST);
		
	}
	
	
	

}
