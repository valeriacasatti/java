package com.coderhouse.models;

import lombok.Data;

@Data
public class User {
	private String id;
	private String name;
	private String lastName;
	private String email;
	private String createdAt;
	
}
