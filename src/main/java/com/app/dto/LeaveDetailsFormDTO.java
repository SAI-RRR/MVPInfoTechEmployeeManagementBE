package com.app.dto;

import java.time.LocalDate;

public class LeaveDetailsFormDTO {

	private Integer leave_Id;
	private LocalDate from_Date;
	private LocalDate to_date;
	private String leave_Status;
	private Integer No_of_Days;
	
	
	
	public Integer getNo_of_Days() {
		return No_of_Days;
	}
	public void setNo_of_Days(Integer no_of_Days) {
		No_of_Days = no_of_Days;
	}
	public Integer getLeave_Id() {
		return leave_Id;
	}
	public void setLeave_Id(Integer leave_Id) {
		this.leave_Id = leave_Id;
	}
	public LocalDate getFrom_Date() {
		return from_Date;
	}
	public void setFrom_Date(LocalDate from_Date) {
		this.from_Date = from_Date;
	}
	public LocalDate getTo_date() {
		return to_date;
	}
	public void setTo_date(LocalDate to_date) {
		this.to_date = to_date;
	}
	public String getLeave_Status() {
		return leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		this.leave_Status = leave_Status;
	}
	
	
}
