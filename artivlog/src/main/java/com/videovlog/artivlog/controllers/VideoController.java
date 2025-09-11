package com.videovlog.artivlog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videovlog.artivlog.services.VideoService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.videovlog.artivlog.models.*;



@RestController
@RequestMapping("/Videos")
public class VideoController {
    
    public final VideoService service;

    public VideoController(VideoService service){ this.service = service;}


    @GetMapping("")
    public List<Video> getVideos(@RequestParam String param) {
       List<Video> videos = new ArrayList<Video>();
        return videos;
    }

    @GetMapping("/{id}")
    public Video getVideo(@RequestParam String param) {
        Video video = new Video();
        return video;
    }
    

    @PostMapping("")
    public Video postVideo(@RequestBody String entity) {
        Video video = new Video();
        return video;
    }

    @PutMapping("path/{id}")
    public Video putVideo(@PathVariable String id, @RequestBody Video entity) {
       Video video = new Video();
        return video;
    }

    @DeleteMapping("/{id}")
    public Video deleteVideo(@PathVariable String id){
        Video video =  new Video();
        return video;
    }
    
    
}
