package com.times.Service;
import org.springframework.stereotype.Service;

import com.times.models.Movie;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
	private List<Movie> movieList = new ArrayList<>();

	public List<Movie> getMovies() {
	    return movieList;
	}

	public void addMovie(Movie movie) {
	   movieList.add(movie);
	}
	


}
