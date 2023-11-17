package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.LeaveDetailsFormDTO;
import com.app.entity.LeaveDetailsFormEntity;
import com.app.repository.LeaveDetailsFormRepository;

@Service
public class LeaveDetailsFromServiceImpl implements LeaveDetailsFormService {

	@Autowired
	private LeaveDetailsFormRepository leaveDetailsFormRepository;
	
	@Override
	public List<LeaveDetailsFormDTO> findAll() {
		
		List<LeaveDetailsFormEntity> leaveDeatilsFromEntity=leaveDetailsFormRepository.findAll();
				
		
		List<LeaveDetailsFormDTO> leaveDetailsFormDto=new ArrayList<>();
		for(LeaveDetailsFormEntity leaveDtlsenty : leaveDeatilsFromEntity ) {
			
			LeaveDetailsFormDTO leavedtls=new LeaveDetailsFormDTO();
			leavedtls.setLeave_Id(leaveDtlsenty.getLeave_id());
			leavedtls.setFrom_Date(leaveDtlsenty.getStart_Date());
			leavedtls.setTo_date(leaveDtlsenty.getEnd_Date());
			leavedtls.setLeave_Status(leaveDtlsenty.getLeave_Status());
			leaveDetailsFormDto.add(leavedtls);
		}
		return leaveDetailsFormDto;
	}

	@Override
	public LeaveDetailsFormEntity addLeaveDetails(LeaveDetailsFormDTO leaveDetailsDto) {
		LeaveDetailsFormEntity leave_DTLS=new LeaveDetailsFormEntity();
		leave_DTLS.setLeave_Status(leaveDetailsDto.getLeave_Status());
		leave_DTLS.setStart_Date(leaveDetailsDto.getFrom_Date());
		leave_DTLS.setEnd_Date(leaveDetailsDto.getTo_date());
		leave_DTLS.setLeave_id(leaveDetailsDto.getLeave_Id());
		return leaveDetailsFormRepository.save(leave_DTLS);
	}
	

	
	

}
