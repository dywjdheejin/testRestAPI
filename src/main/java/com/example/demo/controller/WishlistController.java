package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Userinfo;
import com.example.demo.dto.Wishlist;
import com.example.demo.service.WishlistService;


@RestController
@RequestMapping("wishlist")
public class WishlistController {
	
	private WishlistService service;
	
	@Autowired
	public WishlistController(WishlistService service) {
		this.service = service;
	}
	
	@GetMapping(path="/list")
	public List<Wishlist> getAllwishlist() {
		return service.getAllwishlist();
	}
	
	@GetMapping(path="/getbytitle/{title}")
	public List<Wishlist> getWishlistbyTitle(@PathVariable String title) {
		return service.getWishlistbyTitle(title);
	}

	@GetMapping(path="/getbygenre/{genre}")
	public List<Wishlist> getWishlistbyGenre(@PathVariable String genre) {
		return service.getWishlistbyGenre(genre);
	}
	
	@PostMapping(path="/add")
	public Wishlist insertWishlist(@RequestBody Wishlist wishlist) {
		service.insertWishlist(wishlist);
		return wishlist;
	}
	
	
	@GetMapping(path="/delete/{num}")
	public String deleteWishlist(@PathVariable int num) {
		service.deleteWishlist(num);
		return "success delete "+num;
	}
}
