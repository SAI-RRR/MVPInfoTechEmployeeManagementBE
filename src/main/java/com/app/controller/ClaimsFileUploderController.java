package com.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.ClaimsFileUploder;
import com.app.repository.ClaimsFileRepositary;

@RestController
public class ClaimsFileUploderController {
	
	@Autowired
	ClaimsFileRepositary ClaimsFileRepositary;

	    @PostMapping("/upload")
	    public ClaimsFileUploder m1(@RequestParam( value= "file") MultipartFile file) throws IOException {
	    	
	    	ClaimsFileUploder img = new ClaimsFileUploder( file.getOriginalFilename(),file.getContentType(),file.getBytes() );
	    	//  fileUploderService.post(img);
	    	 final ClaimsFileUploder savedImage = ClaimsFileRepositary.save(img);

			return savedImage;
	    	
	    }
}
