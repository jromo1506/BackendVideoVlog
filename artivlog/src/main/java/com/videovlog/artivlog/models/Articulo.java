package com.videovlog.artivlog.models;

import java.time.Instant;
import java.util.UUID;

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
@Table(name = "articulo")
public class Articulo {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String slug;

    private int version;

    @Column(columnDefinition = "jsonb")
    private String content;

    private Instant createdAt;

    private Instant updatedAt;


    
}
