package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LeaveDetailsFormDTO;
import com.app.entity.LeaveDetailsFormEntity;
import com.app.service.LeaveDetailsFormService;

@RestController
@RequestMapping("/leave_Dtls_Form/api")
public class LeaveDetailsFormController {
	
	@Autowired
	private LeaveDetailsFormService leaveDetailsFormService;

	@PostMapping("/save_Dtls/Api")
	public LeaveDetailsFormEntity createLeaves(@RequestBody LeaveDetailsFormDTO leaveDetails) {
		return leaveDetailsFormService.addLeaveDetails(leaveDetails);
	}
	
	@GetMapping("/leavedtls")
	public List<LeaveDetailsFormDTO> getLeaveDetailFrom(){
		return leaveDetailsFormService.findAll();
	}
	
}
