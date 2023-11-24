package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.ClaimsFileUploder;
import com.app.repository.ClaimsFileRepositary;
@Service
public class FileUploderService {
	
	@Autowired
	ClaimsFileRepositary ClaimsFileRepositary;
	
	
	public String post(ClaimsFileUploder claimsFileUploder) {
		
		ClaimsFileRepositary.save(claimsFileUploder);
		 return "File uploded in db:";
		
	}

}
