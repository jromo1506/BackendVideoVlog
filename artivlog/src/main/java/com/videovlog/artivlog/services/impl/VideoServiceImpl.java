package com.videovlog.artivlog.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.repository.VideoRepository;
import com.videovlog.artivlog.services.VideoService;


import com.videovlog.artivlog.models.Video;

@Service
public class VideoServiceImpl implements  VideoService{

    private VideoRepository videoRepository;
    
    public VideoServiceImpl(VideoRepository videoRepository){
        this.videoRepository = videoRepository;
    }

    @Override
    public Video crearVideo(Video video){
        Video saved  =  videoRepository.save(video);
        return saved;
    }

    @Override
    public Video getVideo(Long id){
        Video vid = videoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Video no encontrado"));
        return vid;
    }

    @Override
    public List<Video> getVideos(){
        List<Video> lista =  videoRepository.findAll();
        return lista;
    }

    @Override
    public Video putVideo(Long id,Video newVideo){
        Video mod =  videoRepository.findById(id).
        orElseThrow(()->new RuntimeException("Not found"));
        mod = newVideo;
        return videoRepository.save(mod);

    }

    
}
