package com.videovlog.artivlog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videovlog.artivlog.models.Post;
import com.videovlog.artivlog.services.PostService;

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
@RequestMapping("/Post")
public class PostController {
    public final PostService service;
    public PostController(PostService service){this.service = service;}


    @GetMapping("path")
    public List<Post> getPosts(@RequestParam String param) {
        List<Post> posts = new ArrayList<Post>();
        return posts;
    }
    
    @GetMapping("/{id}")
    public String getPost(@RequestParam String id) {
        return new String();
    }

    @PostMapping("")
    public Post postPost(@RequestBody Post entity) {
        Post post = new Post();
        return post;
    }

    @PutMapping("/{id}")
    public Post putPost(@PathVariable String id, @RequestBody Post entity) {
       Post post = new Post();
        return post;
    }


    @DeleteMapping("")
    public Post deletePost(@PathVariable String id){
        Post post = new Post();
        return post;
    }
    


    
    
}
