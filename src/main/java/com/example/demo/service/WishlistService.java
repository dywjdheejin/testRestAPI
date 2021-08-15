package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Wishlist;

@Service
public interface WishlistService {
	List<Wishlist> getAllwishlist();
	List<Wishlist> getWishlistbyTitle(String title);
	List<Wishlist> getWishlistbyGenre(String genre);
	void insertWishlist(Wishlist wishlist);
	void deleteWishlist(int num);
}
