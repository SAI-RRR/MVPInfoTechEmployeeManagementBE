package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.LeaveRequest;
import com.app.service.LeaveRequestService;

@RestController
@RequestMapping("/Api/LeavRequst")
public class LeaveController {
	
	@Autowired
	private LeaveRequestService LeaveRequestService;
	
	@GetMapping("/getall-leaves-from-request")
	public List<LeaveRequest> getAllLeaveRequests(){
		return LeaveRequestService.getAllLeaveRequests();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<LeaveRequest> getLeaveRequestById(@PathVariable Long id){
		LeaveRequest leaverequest=LeaveRequestService.getLeaveRequestById(id);
		return ResponseEntity.ok(leaverequest);
	}
	
	
	@PostMapping("/savetherequest")
	public LeaveRequest addLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
	return LeaveRequestService.addLeaveRequest(leaveRequest);
}
	
	@PutMapping("/{id}")
	public ResponseEntity<LeaveRequest> updateLeaveRequest(@PathVariable Long id, @RequestBody LeaveRequest leaveRequest){
		LeaveRequest updateRequest=LeaveRequestService.updateLeaveRequest(id, leaveRequest);
		return ResponseEntity.ok(updateRequest);
	}
	
		
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteLeaveRequest(@PathVariable Long id){
	LeaveRequestService.deleteLeaveRequest(id);
	return ResponseEntity.noContent().build();
	}
	
	}