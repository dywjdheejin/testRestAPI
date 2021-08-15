package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Movielist;
import com.example.demo.service.MovielistService;


@RestController
@RequestMapping("movielist")
public class MovielistController {
	
	private MovielistService service;
	
	@Autowired
	public MovielistController(MovielistService service) {
		this.service = service;
	}
	
	@GetMapping(path="/list")
	public List<Movielist> getAllmovielist() {
		return service.getAllmovielist();
	}
	
	@GetMapping(path="/getbytitle/{title}")
	public List<Movielist> getMovielistbyTitle(@PathVariable String title) {
		return service.getMovielistbyTitle(title);
	}

	@GetMapping(path="/getbygenre/{genre}")
	public List<Movielist> getMovielistbyGenre(@PathVariable String genre) {
		return service.getMovielistbyGenre(genre);
	}
}
