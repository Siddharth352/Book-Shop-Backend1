package com.RestAPI.demo.entity;

public class LoginCredentialTuple {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginCredentialTuple(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		
		return "LoginCredentialTuple [username=" + username + ", password=" + password + "]";
	}
	

}
