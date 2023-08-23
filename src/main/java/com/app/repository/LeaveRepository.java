package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.entity.LeaveRequest;

public interface LeaveRepository extends JpaRepository<LeaveRequest, Long> {

}
