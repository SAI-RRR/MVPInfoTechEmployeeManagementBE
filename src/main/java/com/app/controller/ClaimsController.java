package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dto.ClaimsDTO;
import com.app.entity.ClaimEntity;
import com.app.entity.ClaimType;
import com.app.service.ClaimInterfaceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class ClaimsController {
	
	@Autowired
	ClaimInterfaceImpl claimInterfaceImpl;
	
	@PostMapping("/claims")
	public String claimsDetails(@RequestBody ClaimsDTO claimsDTO) {
		 claimInterfaceImpl.post(claimsDTO);
		 return "Details Added in DataBase:";	
	}
	
	@GetMapping("/claims")
	public List<ClaimEntity> getAll(){
		return claimInterfaceImpl.list();
		
	}
}
