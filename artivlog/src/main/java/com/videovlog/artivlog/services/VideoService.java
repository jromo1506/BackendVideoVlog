package com.videovlog.artivlog.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.models.Video;


public interface VideoService {
    
    public Video crearVideo(Video video);
    public Video getVideo(Long id);
    public List<Video> getVideos();
    public Video putVideo(Long id,Video video);
    public Video postVideo(Video video);
    public void deleteVideo(Long id);
    
}
