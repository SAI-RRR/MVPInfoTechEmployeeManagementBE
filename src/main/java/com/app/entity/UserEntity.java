package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="loginUser")
@Data
public class UserEntity {
	
	@Id
	private String userId;
	private String password;
}
