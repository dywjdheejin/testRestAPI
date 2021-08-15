package com.example.demo.dto;

public class Movielist {
	private int num;
	private String title;
	private String synopsis;
	private String poster_image;
	private String genre;
    
    public Movielist() {
    	super();
    }
    
    public int getNum() {
    	return num;
    }
    public void setNum(int num) {
    	this.num = num;
    }
    
    public String getTitle() {
    	return title;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public String getSynopsis() {
    	return synopsis;
    }
    public void setSynopsis(String synopsis) {
    	this.synopsis = synopsis;
    }
    
    public String getPoster_image() {
    	return poster_image;
    }
    public void setPoster_image(String poster_image) {
    	this.poster_image = poster_image;
    }
    
    public String getGenre() {
    	return genre;
    }
    public void setGenre(String genre) {
    	this.genre = genre;
    }
}
