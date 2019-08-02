package com.nucleus.model;

public class User {
	private String userId;
	private String password;
	private String role;
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public String getRole() {
		return role;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
