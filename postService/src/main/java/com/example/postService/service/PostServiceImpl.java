package com.example.postService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.postService.dao.PostDao;
import com.example.postService.model.Commentsdto;
import com.example.postService.model.Post;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	RestTemplate template;
	
	@Autowired
	PostDao dao;
	
	@Autowired
	PostFeign proxy;
	
	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public String insertPost(Post post) {
		// TODO Auto-generated method stub
		dao.save(post);
		return "post Inserted";
	}

	@Override
	public String deletePost(Post post) {
		// TODO Auto-generated method stub
		dao.delete(post);
		return "post deleted";
	}

	@Override
	public Optional<Post> searchById(int postid) {
		// TODO Auto-generated method stub
		return dao.findById(postid);
	}

	@Override
	public List<Post> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Post> post= dao.findAll();
		List<Post> data=new ArrayList();
		for(Post p: post)
		{
			if(p.getAuthor().equals(author))
				data.add(p);
			}
		return data;
	}

	@Override
	public List<Commentsdto> getCommentsByPid(int postid) {
		//return template.getForObject("http://localhost:8081/comments/search/postid/"+postid,List.class);
		return proxy.searchByPId(postid);
	}

}
