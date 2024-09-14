package com.times.models;


import java.util.List;

public class CinemaHall {
 private int cinemaHallId;
 private String cinemaHallName;
 private Address address;
 private List<Auditorium> auditoriumList;
public int getCinemaHallId() {
	return cinemaHallId;
}

// Getters and setters
public void setCinemaHallId(int cinemaHallId) {
	this.cinemaHallId = cinemaHallId;
}
public String getCinemaHallName() {
	return cinemaHallName;
}
public void setCinemaHallName(String cinemaHallName) {
	this.cinemaHallName = cinemaHallName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public List<Auditorium> getAuditoriumList() {
	return auditoriumList;
}
public void setAuditoriumList(List<Auditorium> auditoriumList) {
	this.auditoriumList = auditoriumList;
}

public CinemaHall(int cinemaHallId, String cinemaHallName, Address address, List<Auditorium> auditoriumList) {
	super();
	this.cinemaHallId = cinemaHallId;
	this.cinemaHallName = cinemaHallName;
	this.address = address;
	this.auditoriumList = auditoriumList;
}

public CinemaHall() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "CinemaHall [cinemaHallId=" + cinemaHallId + ", cinemaHallName=" + cinemaHallName + ", address=" + address
			+ ", auditoriumList=" + auditoriumList + "]";
}


 
}



