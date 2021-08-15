package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserinfoDAO;
import com.example.demo.dto.Userinfo;
import com.example.demo.service.UserinfoService;


@Service
public class UserinfoServiceImpl implements UserinfoService{
	@Autowired
	private UserinfoDAO dao;
	
	@Override
	public List<Userinfo> getAlluserinfo() {
		return dao.getAlluserinfo();
	}
	
	@Override
	public Userinfo getUser(String id) {
		return dao.getUser(id);
	}
	
	@Override
	public void insertUser(Userinfo userinfo) {
		dao.insertUser(userinfo);
	}
	
	@Override
	public void updateUser(Userinfo userinfo) {
		
		dao.updateUser(userinfo);
		
		//Userinfo updateUser = new Userinfo();
		
		//updateUser.setId(userinfo.getId());
		//updateUser.setPw(userinfo.getPw());
		//updateUser.setName(userinfo.getName());
		

		//return dao.updateUser(userinfo);
		//return updateUser;
	}
	
	@Override
	public void deleteUser(String id) {
		dao.deleteUser(id);
	}
	
}
