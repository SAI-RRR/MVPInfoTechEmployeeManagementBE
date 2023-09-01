package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.entity.ClaimEntity;
@Repository
public interface ClaimsRepositery  extends JpaRepository<ClaimEntity, Integer>{

}
