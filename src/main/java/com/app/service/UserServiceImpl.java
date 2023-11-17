package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.entity.UserEntity;
import com.app.dto.UserDetails;
import com.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loginUser(UserDetails userDetails) {
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUserId(userDetails.getUserId());
		userEntity.setPassword(userDetails.getPassword());
		UserEntity user=userRepository.findByUserId(userEntity.getUserId());
		if (user.getPassword().equals(userEntity.getPassword()))
			return userDetails;
		return null;
	}
}
