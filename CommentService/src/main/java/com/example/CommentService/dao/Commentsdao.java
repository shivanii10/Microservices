package com.example.CommentService.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.CommentService.model.Comments;

@Repository
@Transactional
public interface Commentsdao extends JpaRepository<Comments,Integer> {

	
	@Query("select c from Comments c where c.postid=?1")
	public List <Comments> searchByPId(int postid);
	
	@Query("select c from Comments c where c.commentor=?1 ")
	public List<Comments> searchByCommentor(String Commentor);
	
	@Query("select c.commentor from Comments c where c.postid=?1")
	public List<String> FindCommentorbyPid(int postid);
}
