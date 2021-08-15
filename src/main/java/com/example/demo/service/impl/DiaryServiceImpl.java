package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DiaryDAO;
import com.example.demo.dto.Diary;
import com.example.demo.service.DiaryService;

@Service
public class DiaryServiceImpl implements DiaryService{
	
	@Autowired
	private DiaryDAO dao;
	
	@Override
	public List<Diary> getAlldiary() {
		return dao.getAlldiary();
	}

	@Override
	public void insertDiary(Diary diary) {
		dao.insertDiary(diary);
	}

	@Override
	public void updateDiary(Diary diary) {
		dao.updateDiary(diary);
		
	}

	@Override
	public void deleteDiary(int num) {
		dao.deleteDiary(num);
	}

}
