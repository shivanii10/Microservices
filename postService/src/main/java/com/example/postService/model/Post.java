package com.example.postService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Post")
public class Post {
	
	@Id
	int postid;
	String author;
	String description;
	
	public Post()
	{
		
	}
	
	public Post(int postid, String author, String description) {
		super();
		this.postid = postid;
		this.author = author;
		this.description = description;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
