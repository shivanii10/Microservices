package com.example.postService.service;

import java.util.List;
import java.util.Optional;

import com.example.postService.model.Commentsdto;
import com.example.postService.model.Post;

public interface PostService {
	
	public List<Post> getAllPosts();
	public String insertPost(Post post);
	public String deletePost(Post post);
	public Optional <Post> searchById(int postid);
	public List<Post> searchByAuthor(String author);
	public List<Commentsdto> getCommentsByPid(int postid);

}
