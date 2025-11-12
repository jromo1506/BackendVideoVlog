package com.videovlog.artivlog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videovlog.artivlog.services.VideoService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Video>> getVideos(@RequestParam String param) {
       List<Video> videos = this.service.obtenerVideos();
        return ResponseEntity.ok(videos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Video> getVideo(@PathVariable Long id) {
        Video video = this.service.obtenerVideo(id);
        return ResponseEntity.ok(video);
    }
    

    @PostMapping("")
    public ResponseEntity<Video> postVideo(@RequestBody Video entity) {
        Video video = this.service.crearVideo(entity);
        return ResponseEntity.ok(video);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Video> putVideo(@PathVariable Long id, @RequestBody Video entity) {
        Video video  =  this.service.modificarVideo(id, entity);
        return ResponseEntity.ok(video);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideo(@PathVariable Long id){
        this.service.eliminarVideo(id);
        return ResponseEntity.noContent().build();
    }
    
    
}
