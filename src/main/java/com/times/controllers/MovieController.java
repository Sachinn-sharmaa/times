package com.times.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.times.Service.MovieService;
import com.times.models.Movie;


@RestController
@RequestMapping("/movies")
public class MovieController {

	   @Autowired
	   private MovieService movieService;

	   @GetMapping
	   public List<com.times.models.Movie> getAllMovies() {
	       return movieService.getMovies();
	   }

	   @PostMapping
	   public void addMovie(@RequestBody Movie movie) {
	       movieService.addMovie(movie);
	   }
}


