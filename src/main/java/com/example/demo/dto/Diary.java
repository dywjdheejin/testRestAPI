package com.example.demo.dto;

public class Diary {
	private String id;
	private int num;
	private String content;
	private String title;
	private String poster_image;
	
	public Diary() {
    	super();
    }
    
    public String getId() {
    	return id;
    }
    public void setId(String id) {
    	this.id = id;
    }
    
    public int getNum() {
    	return num;
    }
    public void setNum(int num) {
    	this.num = num;
    }
    
    public String getContent() {
    	return content;
    }
    public void setContent(String content) {
    	this.content = content;
    }
    
    public String getTitle() {
    	return title;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public String getPoster_image() {
    	return poster_image;
    }
    public void setPoster_image(String poster_image) {
    	this.poster_image = poster_image;
    }
}
