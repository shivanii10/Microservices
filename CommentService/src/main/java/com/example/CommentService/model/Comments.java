package com.example.CommentService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comments {

	@Id
	int commentid;
	String commentor;
	String Comment;
	int postid;
	
	public Comments()
	{
		
	}
	
	public Comments(int commentid, String commentor, String comment, int postid) {
		super();
		this.commentid = commentid;
		this.commentor = commentor;
		Comment = comment;
		this.postid = postid;
	}
	
	public int getCommentid() {
		return commentid;
	}
	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}
	public String getCommentor() {
		return commentor;
	}
	public void setCommentor(String commentor) {
		this.commentor = commentor;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	
	
}
