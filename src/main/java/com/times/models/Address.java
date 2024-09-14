package com.times.models;

public class Address {
	
	//Address of the cinema hall
	private int pinCode; //ZipCode
	private String street;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pinCode, String street, String city, String state, String country) {
		super();
		this.pinCode = pinCode;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	
}

