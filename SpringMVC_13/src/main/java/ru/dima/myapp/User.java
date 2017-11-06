package ru.dima.myapp;

import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

@Validated
public class User {
	
	@Size(min=3, max=12, message="{name.size.error}")
	private String name;
	@Size(min=3, max=12,message="{password.size.error}")
	private String password;
	private boolean admin;


	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public User() {
	
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
