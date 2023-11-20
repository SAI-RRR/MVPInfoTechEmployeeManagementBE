package com.app.controller;
<<<<<<< HEAD

=======
>>>>>>> e061848243c26a4567b77e36a19e814bbb86db79
import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.ClaimType;
import com.app.service.ClaimInterfaceImpl;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class ClaimsController {
	
	@Autowired
	ClaimInterfaceImpl claimInterfaceImpl;
	@PostMapping("/claims")
<<<<<<< HEAD
	public String claimsDetails( @RequestParam("pic") MultipartFile file, @RequestParam("name")
=======
	public String claimsDetails( @RequestParam("file") MultipartFile file, @RequestParam("name")
>>>>>>> e061848243c26a4567b77e36a19e814bbb86db79
	String name, @RequestParam("description") String description, @RequestParam("claimType") ClaimType claimType, @RequestParam("amount") double amount ) throws IOException {
    return claimInterfaceImpl.claimfileUpload(file, name, claimType, amount, description);
		
	}

}
