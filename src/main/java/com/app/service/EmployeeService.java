package com.app.service;

import java.util.List;

import com.app.dto.EmpDetails;
import com.app.entity.EmpDetailsEntity;

public interface EmployeeService {
	
	EmpDetailsEntity createEmployee(EmpDetails empEntity);
	EmpDetailsEntity getEmpDetails(long id);
	EmpDetailsEntity updateEmp(EmpDetailsEntity empEntity, long id);
	String deleteEmployee(long id);
	List<EmpDetails> findAll();

}
