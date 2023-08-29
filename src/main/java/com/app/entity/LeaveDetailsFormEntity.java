package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave_request_form")
public class LeaveDetailsFormEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Integer leave_id;
	
	@Column(name="Emp_Start_Date")
	private LocalDate start_Date;
	
	@Column(name="Emp_End_Date")
	private LocalDate end_Date;
	

	@Column(name = "leave_status")
	private String leave_Status;
	
	@Column(name="No_of_Days")
	private Integer No_of_Days;

public Integer getNo_of_Days() {
		return No_of_Days;
	}
	public void setNo_of_Days(Integer no_of_Days) {
		No_of_Days = no_of_Days;
	}
public Integer getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(Integer leave_id) {
		this.leave_id = leave_id;
	}
	public LocalDate getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(LocalDate start_Date) {
		this.start_Date = start_Date;
	}
	public LocalDate getEnd_Date() {
		return end_Date;
	}
	public void setEnd_Date(LocalDate end_Date) {
		this.end_Date = end_Date;
	}
	public String getLeave_Status() {
		return leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		this.leave_Status = leave_Status;
	}



}
