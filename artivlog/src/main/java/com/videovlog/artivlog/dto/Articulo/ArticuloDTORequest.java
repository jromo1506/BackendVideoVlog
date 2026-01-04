package com.videovlog.artivlog.dto.Articulo;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ArticuloDTORequest {
    private UUID id;
    private String title;
    private String slug;
    private String content;
    
}
