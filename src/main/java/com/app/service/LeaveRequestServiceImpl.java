package com.app.service;

import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.LeaveRequestDTO;
import com.app.entity.LeaveRequestEntity;
import com.app.repository.LeaveRequestRepository;

@Service
public class LeaveRequestServiceImpl implements LeaveRequestService {

	@Autowired
	private LeaveRequestRepository leaveRequestRepository;

	@Override
	public LeaveRequestEntity addLeaveRequest(LeaveRequestDTO leaveRequestdto) {

		LeaveRequestEntity leaveRequestEntity = new LeaveRequestEntity();
		leaveRequestEntity.setEmpname(leaveRequestdto.getEmpName());
		leaveRequestEntity.setEmpreason(leaveRequestdto.getReason());
		leaveRequestEntity.setLeaveType(leaveRequestdto.getLeaveType());
		leaveRequestEntity.setEmpStartDate(leaveRequestdto.getStartDate());
		leaveRequestEntity.setEmpEndDate(leaveRequestdto.getEndDate());
		leaveRequestEntity.setTotal_leaves(12);
		
		long diff=ChronoUnit.DAYS.between(leaveRequestdto.getStartDate(), leaveRequestdto.getEndDate());
		leaveRequestEntity.setNo_of_Days((int)diff);
		if(leaveRequestEntity.getLeaveType().equals("sick-leave") &&diff<=leaveRequestEntity.getTotal_leaves()) {
			System.out.println("sick-leave Approved");
			leaveRequestEntity.setLeave_Status("Approved");
		}else if(leaveRequestEntity.getLeaveType().equals("compensation-leave") &&diff<=leaveRequestEntity.getTotal_leaves()) {
			System.out.println("compensation-leave Approved");
			leaveRequestEntity.setLeave_Status("Approved");
		
		}
		else if(leaveRequestEntity.getLeaveType().equals("loss-of-pay") &&diff<=leaveRequestEntity.getTotal_leaves()) {
			System.out.println("Loss of pay");
			leaveRequestEntity.setLeave_Status("Loss of pay");
		}else {
			System.out.println("Rejected");
			leaveRequestEntity.setLeave_Status("Rejected");
		}
		/*
		 * //leaveRequestEntity.setDuration(Duration.between(leaveRequestdto.
		 * getStartDate(), leaveRequestdto.getEndDate()));
		 * 
		 * 
		 * Period period = Period.between(leaveRequestdto.getStartDate(),
		 * leaveRequestdto.getEndDate()); leaveRequestEntity.setDuration(period);
		 * leaveRequestEntity.setNo_of_Days(period.getDays() + 1);
		 * 
		 * 
		 * 
		 * 
		 * if(leaveRequestEntity.getNo_of_Days()<=12) { System.out.println("Approved");
		 * leaveRequestEntity.setLeave_Status("Approved"); }else
		 * if(leaveRequestEntity.getNo_of_Days()<=0) {
		 * System.out.println("Loss of pay");
		 * leaveRequestEntity.setLeave_Status("Loss of pay"); }else {
		 * System.out.println("Rejected"); }
		 * 
		 * 
		 * 
		 * 
		 * if(leaveRequestEntity.getDuration().getSeconds()<=(-43200)) {
		 * System.out.println(leaveRequestEntity.getDuration().getSeconds());
		 * System.out.println("Approved");
		 * leaveRequestEntity.setLeave_Status("Approved"); }else
		 * if(leaveRequestEntity.getDuration().getSeconds()>(-43200)) {
		 * System.out.println("Loss of pay");
		 * leaveRequestEntity.setLeave_Status("loss of pay"); }
		 */

		return leaveRequestRepository.save(leaveRequestEntity);
	}

}
