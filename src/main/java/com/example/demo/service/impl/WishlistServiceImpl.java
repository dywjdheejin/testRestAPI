package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.WishlistDAO;
import com.example.demo.dto.Wishlist;
import com.example.demo.service.WishlistService;

@Service
public class WishlistServiceImpl implements WishlistService{
	
	@Autowired
	private WishlistDAO dao;
	
	@Override
	public List<Wishlist> getAllwishlist() {
		return dao.getAllwishlist();
	}
	
	@Override
	public List<Wishlist> getWishlistbyTitle(String title) {
		return dao.getWishlistbyTitle(title);
	}
	
	@Override
	public List<Wishlist> getWishlistbyGenre(String genre) {
		return dao.getWishlistbyGenre(genre);
	}
	
	@Override
	public void insertWishlist(Wishlist wishlist) {
		dao.insertWishlist(wishlist);
	}
	
	@Override
	public void deleteWishlist(int num) {
		dao.deleteWishlist(num);
	}
}
