package com.example.CommentService.controller;

import java.util.List;
import java.util.Optional;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CommentService.model.Comments;
import com.example.CommentService.service.CommentsService;

//http://localhost:8081/comments/search/postid/1

@RestController
@RequestMapping("/comments")
public class CommentsController {
	
	@Autowired
	CommentsService service;
	
	@GetMapping("/try")
	public String showdata()
	{
		return "hey, it's working";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Comment>> showAllComments()
	{
		return new ResponseEntity(service.getAllComments(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public String InsertComment(@RequestBody Comments comment)
	{
		
		return service.insertComment(comment);
	}
	
	@DeleteMapping("/delete")
	public String DeletePost(@RequestBody Comments comment)
	{
		return service.deleteComment(comment);
	}
	
	@GetMapping("/search/postid/{postid}")
	public List <Comments> searchByPId (@PathVariable("postid") Integer postid)
	{
		return service.searchByPostId(postid);
	}

	@GetMapping("/search/commentid/{commentid}")
	public Optional <Comments> searchByCId (@PathVariable("commentid") Integer commentid)
	{
		return service.searchByCId(commentid);
	}
	@GetMapping("search/commentor/{commentor}")
	public List<Comments> searchBycommentor(@PathVariable("commentor") String author)
	{
		return service.searchByCommentor(author);
	}
	
	@GetMapping("/getCommentorByPostId/{postid}")
	public List<String> getCommentorByPostId(@PathVariable("postid") Integer postid)
	{
		return service.FindCommentorbyPid(postid);
	}

}
