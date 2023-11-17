package com.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.EmpDetails;
import com.app.entity.EmpDetailsEntity;
import com.app.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmpDetailsController {
	
	@Autowired
	private EmployeeService employeeService;
	
    // get all employee details
	@GetMapping("/employee")
	public List<EmpDetails> getEmpdetails() {
		return employeeService.findAll();
	}
	
    // posting of employee details
	@PostMapping("/employee")
	public EmpDetailsEntity createEmploye(@RequestBody EmpDetails empDetails) {
		return employeeService.createEmployee(empDetails);
	}

	// get employee by id
	@GetMapping("/employee/{id}")
	public EmpDetailsEntity getEmpDetailsmvp(@PathVariable Long id) {
		return employeeService.getEmpDetails(id) ;
	}

	// update employee details by id
	@PutMapping("/employee/{id}")
	public EmpDetailsEntity updateEmp(@PathVariable Long id, @RequestBody EmpDetailsEntity empDetails) {
		return employeeService.updateEmp(empDetails, id);
	}

	// delete employee details by id
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}

}
