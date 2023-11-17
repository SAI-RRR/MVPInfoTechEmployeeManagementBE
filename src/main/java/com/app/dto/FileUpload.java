package com.app.dto;

import lombok.Data;

@Data
public class FileUpload {
	private int id;
	private String name;
	private String type;
	private byte[] pic;

}
