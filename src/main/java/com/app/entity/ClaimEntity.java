package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
<<<<<<< HEAD
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
=======

>>>>>>> e061848243c26a4567b77e36a19e814bbb86db79
@Entity
@Table(name="FileUpload")
public class ClaimEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="EmpName")
	private String name;
	
	@Column(name="ClaimType")
	@Enumerated(EnumType.STRING)
	private ClaimType claimType;
	
<<<<<<< HEAD
	@NotNull
=======
>>>>>>> e061848243c26a4567b77e36a19e814bbb86db79
	@Column(name="ClaimAmount")
	private double amount;
	
	@Column(name="ClaimDescription")
	private String description;
	
	@Lob
	private byte[] pic;
<<<<<<< HEAD
}
=======
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public ClaimType getClaimType() {
		return claimType;
	}
	public void setClaimType(ClaimType claimType) {
		this.claimType = claimType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

>>>>>>> e061848243c26a4567b77e36a19e814bbb86db79