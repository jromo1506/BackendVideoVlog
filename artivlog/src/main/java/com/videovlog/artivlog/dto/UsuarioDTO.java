package com.videovlog.artivlog.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.videovlog.artivlog.models.Post;
import com.videovlog.artivlog.models.Video;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class UsuarioDTO {
    private Long id;
    private String username;
    private String email;
    private String pfpUrl;
    private String bio;
    private LocalDateTime createdAt;
}
