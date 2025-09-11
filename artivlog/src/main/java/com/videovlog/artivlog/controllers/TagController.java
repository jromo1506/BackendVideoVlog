package com.videovlog.artivlog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videovlog.artivlog.models.Tag;
import com.videovlog.artivlog.services.TagService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/Tags")
public class TagController {
    public final TagService service;
    public TagController(TagService service){this.service = service;}


    @GetMapping("")
    public String getMethodName() {
        return new String();
    }

    @GetMapping("/{tag}")
    public Tag getTag(@RequestParam String id) {
        Tag tag = new Tag();
        return tag;
    }

    @PostMapping("")
    public Tag postTag(@RequestBody Tag entity) {
        Tag tag = new Tag();
        return tag;
    }

    @PutMapping("/{id}")
    public Tag putTag(@PathVariable String id, @RequestBody String entity) {
         Tag tag = new Tag();
        return tag;
    }

    @DeleteMapping("")
    public Tag deleteTag(@PathVariable String id){
        Tag tag = new Tag();
        return tag;
    }
    
    
    
}
