package com.videovlog.artivlog.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Likes")
public class Like {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Boolean positive;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Usuario user;

    @ManyToOne
    @JoinColumn(name ="video_id", nullable = true)
    private Video video;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = true)
    private Post post;


    

}
