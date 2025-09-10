package com.videovlog.artivlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.videovlog.artivlog.models.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video,Long> {

}