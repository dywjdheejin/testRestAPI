package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Diary;

@Repository
public interface DiaryDAO {
	List<Diary> getAlldiary();
	void insertDiary(Diary diary);
	void updateDiary(Diary diary);
	void deleteDiary(int num);
}
