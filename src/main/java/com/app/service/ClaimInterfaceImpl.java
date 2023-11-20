package com.app.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.ClaimEntity;
import com.app.entity.ClaimType;
import com.app.repository.ClaimsRepositery;

<<<<<<< HEAD
=======

>>>>>>> e061848243c26a4567b77e36a19e814bbb86db79
@Service
public class ClaimInterfaceImpl implements ClaimInterface  {
	@Autowired
	ClaimsRepositery claimsRepositery;

	@Override
	public String claimfileUpload(MultipartFile file, String name, ClaimType claimType, double amount,
			String description) {
		ClaimEntity claimEntity = new ClaimEntity();
		claimEntity.setName(name);
		claimEntity.setClaimType(claimType);
		claimEntity.setAmount(amount);
		claimEntity.setDescription(description);
		try {
			claimEntity.setPic(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		claimsRepositery.save(claimEntity);
		
		return  "Details saved successfully in db";
	}
	/*@Autowired
	ClaimsRepositery claimsRepositery;
	
	@Override
	public String claimfileUpload(MultipartFile file, String name, ClaimType claimType, double amount,
			String description) {
		
		ClaimEntity claimEntity = new ClaimEntity();
		claimEntity.setName(name);
		claimEntity.setClaimType(claimType);
		claimEntity.setAmount(amount);
		claimEntity.setDescription(description);
		try {
			claimEntity.setPic(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		claimsRepositery.save(claimEntity);
		return "Details saved successfully in db";
	}*/
	
}
	

