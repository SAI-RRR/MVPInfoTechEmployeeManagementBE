package com.app.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Leave_Request_Form")
public class LeaveRequestEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Emp_Id")
	private Long id;
	
	@Column(name="Emp_Name")
	private String empname;
	
	@Column(name="Leave_Type")
	private String leaveType;
	
	@Column(name="Emp_Start_Date")
	private LocalDate empStartDate;
	
	@Column(name="Emp_End_Date")
	private LocalDate empEndDate;
	
	@Column(name="Emp_Reason")
	private String empreason;
	
	@Column(name="leave_status")
	private String leave_Status;
	
	@Column(name="No_Of_Days")
	private Integer No_of_Days;
	
	@Column(name="Total_Leaves")
	private Integer total_leaves;
	
	@Column(name="sick_Leaves")
	private Integer sick_leaves;
	
	@Column(name="casual_Leaves")
	private Integer casual_leaves;
	
	@Column(name="compensation_Leaves")
	private Integer compensation_leaves;

	public Integer getSick_leaves() {
		return sick_leaves;
	}
	public void setSick_leaves(Integer sick_leaves) {
		this.sick_leaves = sick_leaves;
	}
	public void setCasual_leaves(Integer casual_leaves) {
		this.casual_leaves = casual_leaves;
	}
	public void setCompensation_leaves(Integer compensation_leaves) {
		this.compensation_leaves = compensation_leaves;
	}
	public Integer getCasual_leaves() {
		return casual_leaves;
	}

	public Integer getCompensation_leaves() {
		return compensation_leaves;
	}

	public Integer getTotal_leaves() {
		return total_leaves;
	}

	public void setTotal_leaves(Integer total_leaves) {
		this.total_leaves = total_leaves;
	}



	public Integer getNo_of_Days() {
		return No_of_Days;
	}



	public void setNo_of_Days(Integer no_of_Days) {
		No_of_Days = no_of_Days;
	}




	public String getLeave_Status() {
		return leave_Status;
	}



	public void setLeave_Status(String leave_Status) {
		this.leave_Status = leave_Status;
	}



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
	
	
	public LocalDate getEmpStartDate() {
		return empStartDate;
	}
	public void setEmpStartDate(LocalDate empStartDate) {
		this.empStartDate = empStartDate;
	}
	
	
	public LocalDate getEmpEndDate() {
		return empEndDate;
	}
	
	
	public void setEmpEndDate(LocalDate empEndDate) {
		this.empEndDate = empEndDate;
	}
	
	
	public String getEmpreason() {
		return empreason;
	}
	public void setEmpreason(String empreason) {
		this.empreason = empreason;
	}
	
	
	public String getLeaveType() {
		return leaveType;
	}
	
	
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	
	
}
