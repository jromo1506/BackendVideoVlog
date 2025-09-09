package com.videovlog.artivlog.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

public class Tag {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String contentType;


    @Column(updatable = false);
    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToMany(mappedBy = "tags")
    private List<Post> Post;

    @ManyToMany(mappedBy = "tags")
    private List<Video> videos;


    


}
