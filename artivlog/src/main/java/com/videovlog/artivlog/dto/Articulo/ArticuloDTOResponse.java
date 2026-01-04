package com.videovlog.artivlog.dto.Articulo;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ArticuloDTOResponse {

    private UUID id;
    private String  title;
    private String slug;
    private int version;
    private String content;
    private Instant createdAt;
    private Instant updatedAt;

    
}
