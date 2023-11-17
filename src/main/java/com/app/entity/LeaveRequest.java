package com.app.entity;

import java.util.Calendar;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave_request")
public class LeaveRequest {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String empname;
	private Calendar empStartDate;
	private Calendar empEndDate;
	private String empreason;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Calendar getEmpStartDate() {
		return empStartDate;
	}
	public void setEmpStartDate(Calendar empStartDate) {
		this.empStartDate = empStartDate;
	}
	public Calendar getEmpEndDate() {
		return empEndDate;
	}
	public void setEmpEndDate(Calendar empEndDate) {
		this.empEndDate = empEndDate;
	}
	public String getEmpreason() {
		return empreason;
	}
	public void setEmpreason(String empreason) {
		this.empreason = empreason;
	}
	
	
	
	
}
