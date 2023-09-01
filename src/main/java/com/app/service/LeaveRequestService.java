package com.app.service;

import java.util.List;

import com.app.entity.LeaveRequest;

public interface LeaveRequestService {

	List<LeaveRequest> getAllLeaveRequests();
	LeaveRequest getLeaveRequestById(Long id);
	LeaveRequest addLeaveRequest(LeaveRequest leaveRequest);
	LeaveRequest updateLeaveRequest(Long id, LeaveRequest leaveRequest);
	void deleteLeaveRequest(Long id);
	
	
	
}
