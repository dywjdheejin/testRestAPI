package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MovielistDAO;
import com.example.demo.dto.Movielist;
import com.example.demo.service.MovielistService;

@Service
public class MovielistServiceImpl implements MovielistService{
	@Autowired
	private MovielistDAO dao;
	
	@Override
	public List<Movielist> getAllmovielist() {
		return dao.getAllmovielist();
	}
	
	@Override
	public List<Movielist> getMovielistbyTitle(String title) {
		return dao.getMovielistbyTitle(title);
	}
	
	@Override
	public List<Movielist> getMovielistbyGenre(String genre) {
		return dao.getMovielistbyGenre(genre);
	}
}
