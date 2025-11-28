package com.videovlog.artivlog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.videovlog.artivlog.models.Tag;

public interface TagRepository extends JpaRepository<Tag,Long> {
    Optional <Tag> findByName(String Name);
    
}