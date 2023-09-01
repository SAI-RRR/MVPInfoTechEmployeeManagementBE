package com.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.LeaveRequest;
import com.app.repository.LeaveRepository;

@Service
public class LeaveRequestServiceImpl implements LeaveRequestService {

	@Autowired
	private LeaveRepository LeaveRepository;
	
	@Override
	public List<LeaveRequest> getAllLeaveRequests() {
		
		return LeaveRepository.findAll();
	}

	@Override
	public LeaveRequest getLeaveRequestById(Long id) {
		
		return LeaveRepository.findById(id).get();
		//return LeaveRepository.findById(id).orElse(null);//orElseThrow(()->ResourceNotFoundException("LeaveRequest is not found with this id:"+id));
	}
    
	@Override
	public LeaveRequest addLeaveRequest(LeaveRequest leaverequest) {
		
		return LeaveRepository.save(leaverequest);
	}

	@Override
	public LeaveRequest updateLeaveRequest(Long id, LeaveRequest leaveRequest) {
		
		LeaveRequest Existingrequestid= LeaveRepository.findById(id).get();//orElseThrow(()->ResourceNotFoundException("LeaveRequest is not found with this id:"+id));
		Existingrequestid.setEmpname(leaveRequest.getEmpname());
		Existingrequestid.setEmpStartDate(leaveRequest.getEmpStartDate());
		Existingrequestid.setEmpEndDate(leaveRequest.getEmpEndDate());
		Existingrequestid.setEmpreason(leaveRequest.getEmpreason());
		return LeaveRepository.save(Existingrequestid);
	}

	@Override
	public void deleteLeaveRequest(Long id) {
		LeaveRepository.findById(id).orElse(null);//orElseThrow(()->ResourceNotFoundException("LeaveRequest With this id is not found:"+id));
		LeaveRepository.deleteById(id);
	}

	

}
