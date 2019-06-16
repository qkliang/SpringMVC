package com.atguigu.springmvc.entitys;

public class User {

	private Integer id;
	private String userName;
	private String passwrod;
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
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passwrod=" + passwrod + ", email=" + email
				+ ", address=" + address + "]";
	}
	public User(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}
	public User(Integer id, String userName, String passwrod, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.passwrod = passwrod;
		this.email = email;
	}
	public User() {
		super();
	}
	
	
}
