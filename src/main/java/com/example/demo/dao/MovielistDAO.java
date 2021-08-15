package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Movielist;

@Repository
public interface MovielistDAO {
	List<Movielist> getAllmovielist();
	List<Movielist> getMovielistbyTitle(String title);
	List<Movielist> getMovielistbyGenre(String genre);

}
