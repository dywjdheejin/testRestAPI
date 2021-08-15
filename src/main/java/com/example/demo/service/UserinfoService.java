package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Userinfo;

@Service
public interface UserinfoService {
	List<Userinfo> getAlluserinfo();
	Userinfo getUser(String id);
	void insertUser(Userinfo userinfo);
	void updateUser(Userinfo userinfo);
	void deleteUser(String id);
	
}
