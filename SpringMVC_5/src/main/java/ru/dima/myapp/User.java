package ru.dima.myapp;

public class User {
	private String name;
	private boolean admin;

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	private String password;

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
