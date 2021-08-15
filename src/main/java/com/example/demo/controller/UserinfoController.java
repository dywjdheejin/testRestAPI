package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Userinfo;
import com.example.demo.service.UserinfoService;

@RestController
@RequestMapping("userinfo")
public class UserinfoController {
	
	private UserinfoService service;
	
	@Autowired
	public UserinfoController(UserinfoService service) {
		this.service = service;
	}
	
	@GetMapping(path="/list")
	public List<Userinfo> getAlluserinfo() {
		return service.getAlluserinfo();
	}
	
	@GetMapping(path="/get/{id}")
	public Userinfo getUser(@PathVariable String id) {
		return service.getUser(id);
	}
	
	@PostMapping(path="/add")
	public Userinfo insertUser(@RequestBody Userinfo userinfo) {
		service.insertUser(userinfo);
		return userinfo;
	}
	
	@PostMapping(path="/update")
	public Userinfo updateUser(@RequestBody Userinfo userinfo) {
		service.updateUser(userinfo);
		return userinfo;
	}
	
	@GetMapping(path="/delete/{id}")
	public String deleteUser(@PathVariable String id) {
		service.deleteUser(id);
		return "success delete "+id;
	}
	
}
