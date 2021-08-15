package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Diary;
import com.example.demo.service.DiaryService;

@RestController
@RequestMapping("diary")
public class DiaryController {
private DiaryService service;
	
	@Autowired
	public DiaryController(DiaryService service) {
		this.service = service;
	}
	
	@GetMapping(path="/list")
	public List<Diary> getAlldiary() {
		return service.getAlldiary();
	}
	
	@PostMapping(path="/add")
	public Diary insertDiary(@RequestBody Diary diary) {
		service.insertDiary(diary);
		return diary;
	}
	
	@PostMapping(path="/update")
	public Diary updateDiary(@RequestBody Diary diary) {
		service.updateDiary(diary);
		return diary;
	}
	
	@GetMapping(path="/delete/{num}")
	public String deleteDiary(@PathVariable("num") int num) {
		service.deleteDiary(num);
		return "success delete "+num;
	}
}
