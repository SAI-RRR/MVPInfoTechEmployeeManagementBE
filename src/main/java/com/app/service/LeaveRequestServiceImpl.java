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
		leaveRequestdto.setCasual_leaves(2);
		leaveRequestdto.setSick_leaves(2);
		leaveRequestEntity.setSick_leaves(leaveRequestdto.getSick_leaves());
		leaveRequestEntity.setCasual_leaves(leaveRequestdto.getCasual_leaves());
		leaveRequestEntity.setTotal_leaves((leaveRequestdto.getSick_leaves()+leaveRequestdto.getCasual_leaves()));
		leaveRequestEntity.setCompensation_leaves(leaveRequestdto.getCompensation_leaves());
		
		//Conditions for leave-types
		long diff=ChronoUnit.DAYS.between(leaveRequestdto.getStartDate(), leaveRequestdto.getEndDate());
		leaveRequestEntity.setNo_of_Days((int)diff);
		if(leaveRequestEntity.getLeaveType().equals("sick-leave") &&leaveRequestEntity.getNo_of_Days()<=leaveRequestdto.getSick_leaves()) {
			System.out.println("sick-leave Approved");
			leaveRequestEntity.setTotal_leaves(leaveRequestEntity.getTotal_leaves()-(int)diff);
			leaveRequestEntity.setSick_leaves(leaveRequestdto.getSick_leaves()-leaveRequestEntity.getNo_of_Days());
			leaveRequestEntity.setLeave_Status("sick-leave Approved");
		}else if(leaveRequestEntity.getLeaveType().equals("casual-leave") &&leaveRequestEntity.getNo_of_Days()<=leaveRequestdto.getCasual_leaves()) {
			System.out.println("Approved");
			
			leaveRequestEntity.setTotal_leaves(leaveRequestEntity.getTotal_leaves()-(int)diff);
			leaveRequestEntity.setCasual_leaves(leaveRequestdto.getCasual_leaves()-leaveRequestEntity.getNo_of_Days());
			leaveRequestEntity.setLeave_Status("casual-leave Approved");
		}
//		else if(leaveRequestEntity.getLeaveType().equals("compensation-leave") &&leaveRequestEntity.getNo_of_Days()<=leaveRequestEntity.getTotal_leaves()) {
//			System.out.println("compensation-leave Approved");
//			leaveRequestEntity.setLeave_Status("Approved");
//		
//		}
		else if(leaveRequestEntity.getLeaveType().equals("loss-of-pay") &&leaveRequestEntity.getNo_of_Days()<=leaveRequestEntity.getTotal_leaves()) {
			System.out.println("Loss of pay");
			leaveRequestEntity.setLeave_Status("Loss of pay");
		}else {
			if(leaveRequestEntity.getLeaveType().equals("compensation-leave") &&leaveRequestEntity.getNo_of_Days()<=leaveRequestdto.getCompensation_leaves()) {
				System.out.println("--------------------------------------------------------");
				 leaveRequestEntity.setCompensation_leaves(leaveRequestdto.getCompensation_leaves()-leaveRequestEntity.getNo_of_Days());
				System.out.println("compensation-leave Approved");
				leaveRequestEntity.setLeave_Status("Approved");
			}else {
			System.out.println("Rejected");
			leaveRequestEntity.setLeave_Status("Rejected");
		}
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
