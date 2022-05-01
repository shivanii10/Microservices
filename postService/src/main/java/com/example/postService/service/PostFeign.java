package com.example.postService.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.postService.model.Commentsdto;

@FeignClient(name="Comment-Service",url="http://localhost:8081/comments")
public interface PostFeign {
	@GetMapping("/search/postid/{postid}")
	public List <Commentsdto> searchByPId (@PathVariable("postid") Integer postid);
}
