package com.videovlog.artivlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.videovlog.artivlog.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>{
    
}