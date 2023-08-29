package com.app.dto;

import java.time.LocalDate;

public class LeaveRequestDTO {

	
	private String empName;
	private String leaveType;
	private LocalDate startDate;
	private LocalDate endDate;
	private String reason;
	private Integer No_of_Days;
	
	
	public Integer getNo_of_Days() {
		return No_of_Days;
	}
	public void setNo_of_Days(Integer no_of_Days) {
		No_of_Days = no_of_Days;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
