package com.videovlog.artivlog.models;


import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="Video")
public class Video {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    private String title;
    private String description;
    private String videoUrl;
    private String thumbnailUrl;
    private String visibility;
    private Integer views = 0;

    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name="user_id")
    private Usuario user;


    @OneToMany(mappedBy = "video")
    private List<Like>likes;

    @ManyToMany
    @JoinTable(
        name = "video_tags",
        joinColumns = @JoinColumn(name = "video_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;


    
    
}
