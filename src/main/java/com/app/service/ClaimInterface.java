package com.app.service;

import java.util.List;

import com.app.dto.ClaimsDTO;
import com.app.entity.ClaimEntity;

public interface ClaimInterface {
	
	public ClaimEntity post(ClaimsDTO  claimsDTO);
	
	//public List<ClaimEntity> list();
	
}
