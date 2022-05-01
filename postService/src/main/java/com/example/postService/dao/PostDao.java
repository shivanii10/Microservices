package com.example.postService.dao;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postService.model.Post;

@Repository
@Transactional
public interface PostDao extends JpaRepository<Post,Integer> {

}
