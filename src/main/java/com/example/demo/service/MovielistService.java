package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Movielist;

@Service
public interface MovielistService {
	List<Movielist> getAllmovielist();
	List<Movielist> getMovielistbyTitle(String title);
	List<Movielist> getMovielistbyGenre(String genre);
}
