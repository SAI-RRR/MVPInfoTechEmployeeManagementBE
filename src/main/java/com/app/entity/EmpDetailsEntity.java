package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="empDetailsmvp")
public class EmpDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="emp_name")
	private String empName; 
	
	@Column(name="emp_designation")
	private String designation;
	
	@Column(name="emp_location")
	private String location;
	
	@Column(name="emp_email")
	private String email;
	
	@Column(name="emp_address")
	private String address;
	public EmpDetailsEntity() {
		
	}
}
