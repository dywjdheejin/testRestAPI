package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Userinfo;

@Repository
public interface UserinfoDAO {
	List<Userinfo> getAlluserinfo();
	Userinfo getUser(String id);
	void insertUser(Userinfo userinfo);
	void updateUser(Userinfo userinfo);
	void deleteUser(String id);	
}
