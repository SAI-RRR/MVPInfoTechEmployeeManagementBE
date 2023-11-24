package com.app.dto;

import com.app.entity.ClaimType;

import lombok.Data;

@Data
public class ClaimsDTO {
	
	private int id;
	private String name;
	private ClaimType claimType;
	private double amount;
	private String description;
	private String address;

}
