package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Diary;


@Service
public interface DiaryService {
	List<Diary> getAlldiary();
	void insertDiary(Diary diary);
	void updateDiary(Diary diary);
	void deleteDiary(int num);
}
