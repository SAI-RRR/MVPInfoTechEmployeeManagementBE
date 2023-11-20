package com.app.entity;

import java.time.Duration;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_attendance")
public class EmployeeAttendanceEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String employeeName;
    private LocalDateTime inTime;
    private LocalDateTime outTime;
    private Duration duration;
    
}