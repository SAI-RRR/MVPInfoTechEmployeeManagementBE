package com.app.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ClaimsValidation {
	
	
	private Date timestamp;
	private String message;
	private String details;
	public ClaimsValidation(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
}
