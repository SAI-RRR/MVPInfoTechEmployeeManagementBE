package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.LeaveRequestEntity;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequestEntity, Integer> {

}
