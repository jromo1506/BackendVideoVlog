package com.videovlog.artivlog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videovlog.artivlog.models.Like;
import com.videovlog.artivlog.services.LikeService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/Likes")
public class LikeController {
    public final LikeService service;
    public LikeController(LikeService service){this.service = service;}


    @GetMapping("")
    public List<Like> getLikes(@RequestParam String param) {
        List<Like> likes = new ArrayList<Like>();
        return likes;
    }

    @GetMapping("/{id}")
    public List<Like> getLikesById(@RequestParam String param) {
       List<Like> likes = new ArrayList<Like>();
        return likes;
    }

    @PostMapping("")
    public Like postMethodName(@RequestBody Like entity) {
       
        
        return entity;
    }
 
    @DeleteMapping("")
    public Like deleteLike(@PathVariable String id){
        Like like = new Like();
        return like;
    }
    
    
}
