package com.times.models;

import java.util.Date;
import java.util.HashMap;


public class Movie {
	 private int movieId;
	 private String movieName;
	 private int durationInMins;
	 private String language;
	 private Date releaseDate;
	 private HashMap<String, String> cityShowMap;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getDurationInMins() {
		return durationInMins;
	}
	public void setDurationInMins(int durationInMins) {
		this.durationInMins = durationInMins;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public HashMap<String, String> getCityShowMap() {
		return cityShowMap;
	}
	public void setCityShowMap(HashMap<String, String> cityShowMap) {
		this.cityShowMap = cityShowMap;
	}
	public Movie(int movieId, String movieName, int durationInMins, String language, Date releaseDate,
			HashMap<String, String> cityShowMap) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.durationInMins = durationInMins;
		this.language = language;
		this.releaseDate = releaseDate;
		this.cityShowMap = cityShowMap;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", durationInMins=" + durationInMins
				+ ", language=" + language + ", releaseDate=" + releaseDate + ", cityShowMap=" + cityShowMap + "]";
	}
	    
}
