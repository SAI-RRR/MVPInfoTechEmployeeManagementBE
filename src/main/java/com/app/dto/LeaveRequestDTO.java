package com.app.dto;

import java.time.LocalDate;

public class LeaveRequestDTO {

	
	private String empName;
	private String leaveType;
	private LocalDate startDate;
	private LocalDate endDate;
	private String reason;
	private Integer No_of_Days;
	private int total_leaves;
	private int sick_leaves;
	private int casual_leaves;
	private int compensation_leaves;
	
	public int getCompensation_leaves() {
		return compensation_leaves;
	}
	public void setCompensation_leaves(int compensation_leaves) {
		this.compensation_leaves = compensation_leaves;
	}
	public int getTotal_leaves() {
		return total_leaves;
	}
	public void setTotal_leaves(int total_leaves) {
		this.total_leaves = total_leaves;
	}
	
	public void setSick_leaves(int sick_leaves) {
		this.sick_leaves = 6;
	}
	public void setCasual_leaves(int casual_leaves) {
		this.casual_leaves = 6;
	}
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
	public int getSick_leaves() {
		return sick_leaves;
	}
	public int getCasual_leaves() {
		return casual_leaves;
	}
}
