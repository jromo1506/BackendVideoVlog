package com.videovlog.artivlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.videovlog.artivlog.models.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like,Long>{
    
}