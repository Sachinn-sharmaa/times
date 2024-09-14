package com.times.models;

import java.util.Date;
import java.util.List;

public class Show {
	
	//Details of a particular sho	private int showId;
	private Movie movie;
	private Date startTime;
	private Date endTime;
	private CinemaHall cinemaPlayedAt;
	private List<Seat> seats;
	
	
	public Show(Movie movie, Date startTime, Date endTime, CinemaHall cinemaPlayedAt, List<Seat> seats) {
		super();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = endTime;
		this.cinemaPlayedAt = cinemaPlayedAt;
		this.seats = seats;
	}
	public Show() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public CinemaHall getCinemaPlayedAt() {
		return cinemaPlayedAt;
	}
	public void setCinemaPlayedAt(CinemaHall cinemaPlayedAt) {
		this.cinemaPlayedAt = cinemaPlayedAt;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Show [movie=" + movie + ", startTime=" + startTime + ", endTime=" + endTime + ", cinemaPlayedAt="
				+ cinemaPlayedAt + ", seats=" + seats + "]";
	}
}
