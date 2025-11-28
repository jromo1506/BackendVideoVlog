package com.videovlog.artivlog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.models.Tag;


public interface TagService {
    Tag crearTag(String name);
    void eliminarTag(Long id);
    List<Tag> obtenerTags();
    List<Tag> obtenerTagsVideo(Long idVideo);
    Tag obtenerTag(Long id);
    Tag anadirTagVideo(Long idVideo,Long idTag);
    
}
