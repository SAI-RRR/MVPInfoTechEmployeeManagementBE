package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDetails;
import com.app.repository.UserRepository;
import com.app.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public UserService userService;
	
	  @PostMapping("/login") 
	  public ResponseEntity<?> loginUser(@RequestBody UserDetails userDetails) {
		  UserDetails userDtls=userService.loginUser(userDetails);
		  if(userDtls!=null)
		  return ResponseEntity.ok(userDtls) ; 
		  return (ResponseEntity<?>) ResponseEntity.internalServerError();
		  }
	 
	
	
			/*
			 * @PostMapping("/login") public ResponseEntity<?> loginUser1(@RequestBody
			 * UserEntity userData){ UserEntity
			 * user=userRepository.findByUserId(userData.getUserId());
			 * if(user.getPassword().equals(userData.getPassword())) return
			 * ResponseEntity.ok(user); return
			 * (ResponseEntity<?>)ResponseEntity.internalServerError(); }
			 */
	 
}
