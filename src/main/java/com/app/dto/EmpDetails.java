package com.app.dto;

import lombok.Data;

@Data
public class EmpDetails {
	
	private long id;
	private String empName; 
	private String designation;
	private String email;
	private String location;
	private String address;
}
