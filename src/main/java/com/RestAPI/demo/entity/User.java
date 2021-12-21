package com.RestAPI.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	
	@Id
	private int userid;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private String firstName;
	private String LastName;
	private String password;
	private String email;
	private int age;
	private long phoneNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public User(int userid, String userName, String firstName, String lastName, String password, String email, int age,
			long phoneNumber) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.firstName = firstName;
		LastName = lastName;
		this.password = password;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
