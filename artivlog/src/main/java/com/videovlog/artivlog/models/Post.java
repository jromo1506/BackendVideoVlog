package com.videovlog.artivlog.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Post {
    private Long id;
    private String text;
    private String status;

    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "post")
    private List<Like> likes;


    @ManyToMany
    @JoinTable(
        name = "post_tags",
        joinColum = @JoinColumn(name = "post_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;


    

    



    

}
