package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Wishlist;

@Repository
public interface WishlistDAO {
	List<Wishlist> getAllwishlist();
	List<Wishlist> getWishlistbyTitle(String title);
	List<Wishlist> getWishlistbyGenre(String genre);
	void insertWishlist(Wishlist wishlist);
	void deleteWishlist(int num);
}
