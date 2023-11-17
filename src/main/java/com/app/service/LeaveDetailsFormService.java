package com.app.service;

import java.util.List;

import com.app.dto.LeaveDetailsFormDTO;
import com.app.entity.LeaveDetailsFormEntity;



public interface LeaveDetailsFormService {

	LeaveDetailsFormEntity addLeaveDetails(LeaveDetailsFormDTO leaveDetailsDto);

	List<LeaveDetailsFormDTO> findAll();
	
}
