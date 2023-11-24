package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="FileUpload_new")
public class ClaimEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="EmpName")
	private String name;
	
	@Column(name="ClaimType")
	@Enumerated(EnumType.STRING)
	private ClaimType claimType;
	

	@Column(name="ClaimAmount")
	private double amount;
	
	@Column(name="ClaimDescription")
	private String description;
	
	@Column(name="address")
	private String address;

		
}
