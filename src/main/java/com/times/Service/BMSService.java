package com.times.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.times.models.CinemaHall;
import com.times.models.Movie;

public class BMSService {
	    List<CinemaHall> cinemas = new ArrayList<>(); // In-memory storage

	    public BMSService() {
	        // Initializing data
	    	
	        cinemas.add(new CinemaHall(1, "Cinema 1", "Mumbai"));
	        cinemas.add(new CinemaHall("Cinema 2", "Delhi"));
	    }

	    public List<CinemaHall> getCinemaHalls(String city) {
	        // In-memory search
	        return cinemas.stream()
	                      .filter(cinema -> cinema.getAddress().getCity().equals(city))
	                      .collect(Collectors.toList());
	    }

	    public List<Movie> getMovies(Date date, String city) {
	        // Find all movies playing on the given date in the given city
	        List<Movie> movies = new ArrayList<>();
	        for (CinemaHall cinema : cinemas) {
	            if (cinema.getAddress().getCity().equals(city)) {
	                movies.addAll(cinema.getMovies(Collections.singletonList(date)).values());
	            }
	        }
	        return movies;
	    }
	}


}
