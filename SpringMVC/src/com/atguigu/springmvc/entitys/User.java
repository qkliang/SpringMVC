package com.atguigu.springmvc.entitys;

public class User {

	private String userName;
	private String email;
	private Address address;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", address=" + address + "]";
	}
	public User(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}
	
}
