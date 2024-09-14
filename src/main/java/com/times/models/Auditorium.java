package com.times.models;

import java.util.List;

public class Auditorium {
		//Contains details of the auditorium
	private int auditoriumId;
	private String auditoriumName;
	private int totalSeats;
			
	private List<Show> shows;

	public Auditorium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auditorium(int auditoriumId, String auditoriumName, int totalSeats, List<Show> shows) {
		super();
		this.auditoriumId = auditoriumId;
		this.auditoriumName = auditoriumName;
		this.totalSeats = totalSeats;
		this.shows = shows;
	}

	public int getAuditoriumId() {
		return auditoriumId;
	}

	public void setAuditoriumId(int auditoriumId) {
		this.auditoriumId = auditoriumId;
	}

	public String getAuditoriumName() {
		return auditoriumName;
	}

	public void setAuditoriumName(String auditoriumName) {
		this.auditoriumName = auditoriumName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}

	@Override
	public String toString() {
		return "Auditorium [auditoriumId=" + auditoriumId + ", auditoriumName=" + auditoriumName + ", totalSeats="
				+ totalSeats + ", shows=" + shows + "]";
	}
	
	
		
}
