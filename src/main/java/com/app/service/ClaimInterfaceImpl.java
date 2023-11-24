package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ClaimsDTO;
import com.app.entity.ClaimEntity;
import com.app.repository.ClaimsRepositery;

@Service
public class ClaimInterfaceImpl implements ClaimInterface  {
	@Autowired
	ClaimsRepositery claimsRepositery;

	@Override
	public ClaimEntity post(ClaimsDTO claimsDTO) {
		
		ClaimEntity claims = new ClaimEntity();
		claims.setId(claimsDTO.getId());
		claims.setName(claimsDTO.getName());
		claims.setAmount(claimsDTO.getAmount());
		claims.setAddress(claimsDTO.getAddress());
		claims.setClaimType(claimsDTO.getClaimType());
		claims.setDescription(claimsDTO.getDescription());
		return claimsRepositery.save(claims);
	}

	//@Override
	public List<ClaimEntity> list() {
		List<ClaimEntity> sf =  claimsRepositery.findAll();
		return sf;
	}
	

	/*@Override
	public String claimfileUpload(MultipartFile file, String name, ClaimType claimType, double amount,
			String description) {
		ClaimEntity claimEntity = new ClaimEntity();
		claimEntity.setName(name);
		claimEntity.setClaimType(claimType);
		claimEntity.setAmount(amount);
		claimEntity.setDescription(description);
		claimsRepositery.save(claimEntity);
		return  "Details saved successfully in db";
	}*/
	
	
}
	

