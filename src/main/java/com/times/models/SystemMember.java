package com.times.models;

public class SystemMember extends User {
	//this would serve as a base class to both of the child user class.. 
	private Account account;
	private String name;
	private String email;
	private Address address;
	
	
	public SystemMember(Account account, String name, String email, Address address) {
		super();
		this.account = account;
		this.name = name;
		this.email = email;
		this.address = address;
	}


	public SystemMember() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
		return "SystemMember [account=" + account + ", name=" + name + ", email=" + email + ", address=" + address
				+ "]";
	}
}
