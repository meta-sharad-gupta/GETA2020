package com.geta.RestWebServive;

public class Store {

	private int bookID;
	private String name;
	private String author;
	private String publisher;
	private int publishedYear;
	
	public Store() {
		
	}
	
	public Store(int bookID, String name, String author, String publisher, int publishedYear) 
	{
//		super();
		this.bookID = bookID;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.publishedYear = publishedYear;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	
}
