package com.example.CommentService.service;

import java.util.List;
import java.util.Optional;

import javax.xml.stream.events.Comment;

import com.example.CommentService.model.Comments;


public interface CommentsService {
	
	public List<Comments> getAllComments();
	public String insertComment(Comments comment);
	public String deleteComment(Comments comment);
	public Optional<Comments> searchByCId(int commentid);
	public List<Comments> searchByPostId(int postid);
	public List<Comments> searchByCommentor(String Commentor);
	public List<String> FindCommentorbyPid(int postid);
	

}
