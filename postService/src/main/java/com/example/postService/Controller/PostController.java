package com.example.postService.Controller;

import java.util.List;
import java.util.Optional;

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

import com.example.postService.model.Commentsdto;
import com.example.postService.model.Post;
import com.example.postService.service.PostService;

//http://localhost:8083/posts/search/commentByPostId/101

@RestController
@RequestMapping("/posts")

public class PostController {
	
	@Autowired
	PostService service;
	
	@GetMapping("/try")
	public String showdata()
	{
		return "hey, it's working";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Post>> showAllPosts()
	{
		return new ResponseEntity(service.getAllPosts(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public String Insertpost(@RequestBody Post post)
	{
		
		return service.insertPost(post);
	}
	
	@DeleteMapping("/delete")
	public String DeletePost(@RequestBody Post post)
	{
		return service.deletePost(post);
	}
	
	@GetMapping("/search/postid/{postid}")
	public Optional <Post> searchById (@PathVariable("postid") Integer postid)
	{
		return service.searchById(postid);
	}

	@GetMapping("search/author/{author}")
	public List<Post> searchByAuthor(@PathVariable("author") String author)
	{
		return service.searchByAuthor(author);
	}
	
	@GetMapping("search/commentByPostId/{postid}")
	public List<Commentsdto> getCommentsByPostId(@PathVariable("postid") Integer postid)
	{
		return service.getCommentsByPid(postid);
	}
}
