package com.videovlog.artivlog.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.models.Video;


public interface VideoService {
    
    public Video crearVideo(Video video);
    public Video obtenerVideo(Long id);
    public List<Video> obtenerVideos();
    public Video modificarVideo(Long id,Video video);
    public void eliminarVideo(Long id);
    
}
