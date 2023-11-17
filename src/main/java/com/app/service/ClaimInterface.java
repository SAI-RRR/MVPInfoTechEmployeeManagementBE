package com.app.service;

import org.springframework.web.multipart.MultipartFile;

import com.app.entity.ClaimType;


public interface ClaimInterface {
	public String claimfileUpload(MultipartFile file,String name,ClaimType claimType,double amount,String description );

}
