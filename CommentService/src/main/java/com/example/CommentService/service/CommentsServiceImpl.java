package com.example.CommentService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CommentService.dao.Commentsdao;
import com.example.CommentService.model.Comments;


@Service
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	Commentsdao dao;
	
	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public String insertComment(Comments comment) {
		// TODO Auto-generated method stub
			dao.save(comment);
			return "comment inserted";
	}

	@Override
	public String deleteComment(Comments comment) {
		// TODO Auto-generated method stub
		dao.delete(comment);
		return "comment deleted";
	}

	@Override
	public Optional<Comments> searchByCId(int commentid) {
		// TODO Auto-generated method stub
		return dao.findById(commentid);
	}

	@Override
	public List <Comments> searchByPostId(int postid) {
		// TODO Auto-generated method stub
		return dao.searchByPId(postid);
	}
	

	@Override
	public List<Comments> searchByCommentor(String Commentor) {
		// TODO Auto-generated method stub
		
		/*  METHOD 1
		List<Comments> comment_= dao.findAll();
		List<Comments> data=new ArrayList();
		for(Comments c: comment_)
		{
			if(c.getCommentor().equals(Commentor))
				data.add(c);
			}
		return data; */
		
		//METHOD 2 Dynamic Query in dao  
		return dao.searchByCommentor(Commentor);
	}

	@Override
	public List<String> FindCommentorbyPid(int postid) {
		// TODO Auto-generated method stub
		return dao.FindCommentorbyPid(postid);
	}

}
