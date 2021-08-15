package com.example.demo.dto;

public class Diary {
	private String id;
	private int num;
	private String content;
	
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
}
