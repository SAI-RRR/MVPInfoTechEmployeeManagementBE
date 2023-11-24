package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Claims_FileUploder")
public class ClaimsFileUploder {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	@Lob
	@Column(name = "pic")
	private byte[] pic;

	public ClaimsFileUploder(String name, String type, byte[] pic) {
	        this.name = name;
	        this.type = type;
	        this.pic = pic;
	    }

}
